package si.um.feri.obu.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JMSRunner implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        JmsDurableSubscriber jmsDurableSubscriber= new JmsDurableSubscriber();
        jmsDurableSubscriber.subscribe();

    }
}
