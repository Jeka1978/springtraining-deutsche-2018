package aop_exception_handling;

import aop_exception_handling.businness.MainMainService;
import org.springframework.context.annotation.*;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableRetry
@EnableAspectJAutoProxy
@PropertySource("classpath:mail.properties")
public class MainConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        context.getBean(MainMainService.class).doStuff();
    }
}
