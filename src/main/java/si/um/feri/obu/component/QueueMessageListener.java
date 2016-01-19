package si.um.feri.obu.component;

import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class QueueMessageListener {

    public static final String QPID_ICF = "org.wso2.andes.jndi.PropertiesFileInitialContextFactory";
    private static final String CF_NAME_PREFIX = "connectionfactory.";
    private static final String CF_NAME = "qpidConnectionfactory";
    String userName = "student";
    String password = "student";
    private static String CARBON_CLIENT_ID = "svizec.informatika.uni-mb.si";
    private static String CARBON_VIRTUAL_HOST_NAME = "carbon";
    private static String CARBON_DEFAULT_HOSTNAME = "svizec.informatika.uni-mb.si";
    private static String CARBON_DEFAULT_PORT = "5682";

    private static String queueNameNapaka = "NapakaZabelezena";
    private static String queueNameAvtovleka = "AvtovlekaAktivirana";
    private static String queueNameNapakaOdpravljena = "NapakaOdpravljena";

    public void registerSubscribers() throws NamingException,InterruptedException, JMSException {
        try {
            InitialContext ctx = initQueue();

            QueueConnectionFactory connFactory = (QueueConnectionFactory) ctx.lookup(CF_NAME);
            QueueConnection queueConnection = connFactory.createQueueConnection();
            queueConnection.start();
            QueueSession queueSession = queueConnection.createQueueSession(false, QueueSession.AUTO_ACKNOWLEDGE);

            Queue queueNapaka = (Queue) ctx.lookup(queueNameNapaka);
            MessageConsumer queueReceiver = queueSession.createConsumer(queueNapaka);
            queueReceiver.setMessageListener(new QueueListener(queueConnection, queueSession, queueReceiver));

            Queue queueAvtovleka = (Queue) ctx.lookup(queueNameAvtovleka);
            MessageConsumer queueReceiverAvtovleka = queueSession.createConsumer(queueAvtovleka);
            queueReceiver.setMessageListener(new QueueListener(queueConnection, queueSession, queueReceiverAvtovleka));

            Queue queueNapakaOdpravljena = (Queue) ctx.lookup(queueNameNapakaOdpravljena);
            MessageConsumer queueReceiverNapakaOdpravljena = queueSession.createConsumer(queueNapakaOdpravljena);
            queueReceiver.setMessageListener(new QueueListener(queueConnection, queueSession, queueReceiverNapakaOdpravljena));

        } catch (NamingException e) {
            e.printStackTrace();
        } catch (JMSException e) {
            System.out.println("WSO2 ESB Permission denied [error code 403: access refused]");
        }
    }

    private InitialContext initQueue() throws NamingException {
        Properties properties = new Properties();
        properties.put(Context.INITIAL_CONTEXT_FACTORY, QPID_ICF);
        properties.put(CF_NAME_PREFIX + CF_NAME, getTCPConnectionURL(userName, password));
        properties.put("queue." + queueNameNapaka, queueNameNapaka);
        properties.put("queue." + queueNameAvtovleka, queueNameAvtovleka);
        properties.put("queue." + queueNameNapakaOdpravljena, queueNameNapakaOdpravljena);
        InitialContext ctx = new InitialContext(properties);
        System.out.println("SUBSCRIBE QUEUE getTCPConnectionURL(userName,password) = " + getTCPConnectionURL(userName, password));
        return ctx;
    }

    private String getTCPConnectionURL(String username, String password) {
        return new StringBuffer()
                .append("amqp://").append(username).append(":").append(password)
                .append("@").append(CARBON_CLIENT_ID)
                .append("/").append(CARBON_VIRTUAL_HOST_NAME)
                .append("?brokerlist='tcp://").append(CARBON_DEFAULT_HOSTNAME).append(":").append(CARBON_DEFAULT_PORT).append("'")
                .toString();
    }

}
