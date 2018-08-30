package check_bean_inhertiance;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@DoucheBankComponent
public class Mother {

    @PostConstruct
    public final void init(){
        doWork();
    }

    protected void doWork() {
        System.out.println("Я мама");
    }
}
