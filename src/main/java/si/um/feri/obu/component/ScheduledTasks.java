package si.um.feri.obu.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import si.um.feri.obu.repository.OBURepository;
import si.um.feri.obu.service.OBUService;

@Component
public class ScheduledTasks {

    @Autowired
    OBUService obuService;

    @Autowired
    OBURepository obuRepository;



}
