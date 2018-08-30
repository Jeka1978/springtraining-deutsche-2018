package check_bean_inhertiance;/**
 * @author Evgeny Borisov
 */

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Documented
@Component
@Inherited
public @interface DoucheBankComponent {
    @AliasFor(
            annotation = Component.class
    )
    String value() default "";
}
