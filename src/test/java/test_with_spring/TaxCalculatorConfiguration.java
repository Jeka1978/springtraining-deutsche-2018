package test_with_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class TaxCalculatorConfiguration {
    @PostConstruct
    public void init(){
        System.out.println("************************configuration was loaded");
    }
}
