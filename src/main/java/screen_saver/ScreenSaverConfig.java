package screen_saver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
//@ImportResource("classpath:context.xml")
public class ScreenSaverConfig {

    @Autowired
    private ApplicationContext context;

    private Random random = new Random();
    @Value("${JAVA_HOME}")
    private String javaHome;

    @Bean
    public ColorFrame frame(){
        return new ColorFrame(javaHome) {
            @Override
            protected Color getColorBean() {
                return color();
            }
        };
    }


    @Bean
    @Scope("prototype")
    public Color color(){
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }















}
