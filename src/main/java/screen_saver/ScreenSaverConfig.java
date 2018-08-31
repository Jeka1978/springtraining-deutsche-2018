package screen_saver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import javax.swing.*;
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




    @Bean
    @Scope(value = "twoSeconds", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color color(){
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }















}
