package si.um.feri.obu.component;

    import javax.jms.Message;
    import javax.jms.QueueSession;
    import javax.jms.TextMessage;
    import javax.jms.Topic;
    import javax.jms.TopicConnection;
    import javax.jms.TopicConnectionFactory;
    import javax.jms.TopicSession;
    import javax.naming.Context;
    import javax.naming.InitialContext;
    import java.util.Properties;
public class JmsDurableSubscriber {

    public static final String ANDES_ICF = "org.wso2.andes.jndi.PropertiesFileInitialContextFactory";
    private static final String CF_NAME_PREFIX = "connectionfactory.";
    private static final String CF_NAME = "qpidConnectionfactory";
    String userName = "student";
    String password = "student";
    private static String CARBON_CLIENT_ID = "svizec.informatika.uni-mb.si";
    private static String CARBON_VIRTUAL_HOST_NAME = "carbon";
    private static String CARBON_DEFAULT_HOSTNAME = "svizec.informatika.uni-mb.si";
    private static String CARBON_DEFAULT_PORT = "5682";
    String topicName = "obu2";
    private String subscriptionId = "mySub1";
    private boolean useListener = true;
    private int delayBetMessages = 200;
    private int messageCount = 100;
    private SampleMessageListener messageListener;

    public void subscribe()  {
        try {
            Properties properties = new Properties();
            properties.put(Context.INITIAL_CONTEXT_FACTORY, ANDES_ICF);
            properties.put(CF_NAME_PREFIX + CF_NAME, getTCPConnectionURL(userName, password));
            properties.put("topic."+topicName,topicName);
            System.out.println("SUBSCRIBE getTCPConnectionURL(userName,password) = " + getTCPConnectionURL(userName, password));
            InitialContext ctx = new InitialContext(properties);
            // Lookup connection factory
            TopicConnectionFactory connFactory = (TopicConnectionFactory) ctx.lookup(CF_NAME);
            TopicConnection topicConnection = connFactory.createTopicConnection();
            topicConnection.start();
            TopicSession topicSession =
                    topicConnection.createTopicSession(false, QueueSession.AUTO_ACKNOWLEDGE);
            // create durable subscriber with subscription ID
            Topic topic = (Topic) ctx.lookup(topicName);
            javax.jms.TopicSubscriber  topicSubscriber = topicSession.createDurableSubscriber(topic,subscriptionId);
            if(!useListener)  {
                for(int count=0;count<messageCount;count++) {
                    Message message = topicSubscriber.receive();
                    System.out.println("count = " + count);
                    if (message instanceof TextMessage) {
                        TextMessage textMessage = (TextMessage) message;
                        System.out.println(count+". textMessage.getText() = " + textMessage.getText());
                    }
                    if(delayBetMessages !=0)    {
                        Thread.sleep(delayBetMessages);
                    }
                }
                topicConnection.close();
            } else {
                messageListener = new SampleMessageListener(topicConnection,topicSession,topicSubscriber,
                        delayBetMessages,messageCount,subscriptionId);
                topicSubscriber.setMessageListener(messageListener);
                Thread.sleep(90*1000*60);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getTCPConnectionURL(String username, String password) {
        return new StringBuffer()
                .append("amqp://").append(username).append(":").append(password)
                .append("@").append(CARBON_CLIENT_ID)
                .append("/").append(CARBON_VIRTUAL_HOST_NAME)
                .append("?brokerlist='tcp://").append(CARBON_DEFAULT_HOSTNAME).append(":").append(CARBON_DEFAULT_PORT).append("'")
                .toString();
    }
    public void stop(){
        this.messageListener.close();
    }
}
