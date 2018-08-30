package quoters;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Evgeny Borisov
 */
@PropertySource("classpath:quotes.properties")
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Config {

}
