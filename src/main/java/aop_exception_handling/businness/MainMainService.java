package aop_exception_handling.businness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainMainService {
    @Autowired
    private SuperDuperService service;


    @Retryable(backoff = @Backoff(delay = 300))
    public void doStuff(){
        service.saveAll();
    }

}
