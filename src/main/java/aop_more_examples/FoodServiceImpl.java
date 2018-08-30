package aop_more_examples;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class FoodServiceImpl implements FoodService {
    @Override
    @Secured
    public void makeFood() {
        System.out.println("Очень вкусная еда");
    }
}
