package si.um.feri.obu.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueueRunner implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {

        QueueMessageListener queueMessageListener = new QueueMessageListener();
        queueMessageListener.registerSubscribers();

    }
}
