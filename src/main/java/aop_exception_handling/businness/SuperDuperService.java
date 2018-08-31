package aop_exception_handling.businness;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class SuperDuperService {

    private final SuperDuperDao dao;

    public void saveAll() {
        System.out.println("working...");
        dao.save();
    }
}
