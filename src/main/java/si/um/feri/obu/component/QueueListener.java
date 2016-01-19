package si.um.feri.obu.component;

import org.springframework.beans.factory.annotation.Autowired;
import si.um.feri.obu.domain.xjc.SendNotificationRequest;
import si.um.feri.obu.service.OBUService;

import javax.jms.*;

public class QueueListener implements MessageListener {

    @Autowired
    OBUService obuService;

    private QueueConnection queueConnection;
    private QueueSession queueSession;
    private MessageConsumer queueConsumer;

    public QueueListener(QueueConnection connection, QueueSession session, MessageConsumer consumer) {
        this.queueConnection = connection;
        this.queueSession = session;
        this.queueConsumer = consumer;
        System.out.println("Starting Queue Listener....");
    }

    @Override
    public void onMessage(Message message) {
        TextMessage receivedMessage = (TextMessage) message;
        try {
            System.out.println("Got the message ==> " + receivedMessage.getText());
            if(obuService.getOBUs().containsKey(receivedMessage.getText())) {
                SendNotificationRequest request = new SendNotificationRequest();
                request.setOBUId(receivedMessage.getText());
                request.setTrr("");
                request.setMessage("Avtoservis2 sporoča:" + message.getJMSDestination().toString());
                obuService.sendNotificationToOBU(request);
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
