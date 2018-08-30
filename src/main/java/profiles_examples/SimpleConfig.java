package profiles_examples;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

import static profiles_examples.ProfilesConst.PROD;

/**
 * @author Evgeny Borisov
 */
@Profile(PROD)
@Configuration
public class SimpleConfig {
    @PostConstruct
    public void init(){
        System.out.println("это надпись не должна появится, даже если это конфигурацию импортируют насильно");
    }
}
