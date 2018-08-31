package aop_more_examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class MainConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        context.getBean(FoodService.class).makeFood();
    }
}
