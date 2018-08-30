package profiles_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
@Import(SimpleConfig.class)
//spring.profiles.active=DEV/PROD
public class MainConfig {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(MainConfig.class);
    }
}
