package screen_saver;

import org.springframework.beans.factory.annotation.Value;
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

    private Random random = new Random();
    @Value("${JAVA_HOME}")
    private String javaHome;

    @Bean
    public ColorFrame frame(){
        return new ColorFrame(javaHome);
    }

    @Bean
    @Scope("prototype")
    public Color color(){
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }















}
