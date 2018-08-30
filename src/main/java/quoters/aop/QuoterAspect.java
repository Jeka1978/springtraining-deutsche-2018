package quoters.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */

@Aspect
@Component
public class QuoterAspect {

    @Pointcut("execution(* quoters..*.say*(..))")
    @PostConstruct
    public void sayMethods(){}


    @Before("sayMethods()")
    public void beforeSayMethods(JoinPoint jp){
        System.out.println("This is quote "+jp.getTarget().getClass().getSimpleName()+" : ");
    }

}
