package profiles_examples;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class DBService {

    private final Dao dao;

    @Scheduled(fixedDelay = 1000)
    public void doWork(){
        System.out.println("stuff");
        dao.saveAll();
    }
}

