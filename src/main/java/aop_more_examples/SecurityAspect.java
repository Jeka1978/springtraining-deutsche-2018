package aop_more_examples;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class SecurityAspect {

    @Around("@annotation(Secured)")
    public Object handleSecuredMethods(ProceedingJoinPoint pjp) throws Throwable {
        if (new Random().nextBoolean()) {
            return pjp.proceed();
        } else {
            throw new SecurityException("not allowed here, try again");
        }
    }
}
