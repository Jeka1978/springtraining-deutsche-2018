package check_bean_inhertiance;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
public class Son extends Mother {
    @Override
    protected void doWork() {
        System.out.println("Всё хорошо");
    }
}
