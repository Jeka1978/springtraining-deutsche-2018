package profiles_examples;/**
 * @author Evgeny Borisov
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static profiles_examples.ProfilesConst.PROD;

@Retention(RUNTIME)
@Configuration
@Profile(PROD)
public @interface ProdConfig {
}
