package quoters;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class MainService {

    @EventListener(ContextRefreshedEvent.class)
    public void sayBlabla(){
        System.out.println("BLBALBABLA");
    }


}










