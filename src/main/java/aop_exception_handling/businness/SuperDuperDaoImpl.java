package aop_exception_handling.businness;

import aop_exception_handling.DBRuntimeException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Repository
public class SuperDuperDaoImpl implements SuperDuperDao {
    private Random random = new Random();
    @Override

    public void save() {
        System.out.println("attempting...");
        if (random.nextInt(5) != 3) {
            throw new DBRuntimeException("fire all DBA");
        }
        System.out.println("Saving...");
    }
}
