package aop_exception_handling;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.ref.WeakReference;
import java.util.*;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class ExceptionHandler {

    @Value("${dbaMails}")
    private String[] mails;

    private Map<Exception, Void> exceptions = new WeakHashMap<>();

    @AfterThrowing(value = "execution(* aop_exception_handling.businness..*.*(..))",throwing = "ex")
    public void handleDbExceptions(DBRuntimeException ex) {

        if (!exceptions.containsKey(ex)) {
            exceptions.put(ex,null);
            Arrays.stream(mails).forEach(s -> System.out.println("sending to "+s+" "+ex.getMessage()));
        }
    }

}
