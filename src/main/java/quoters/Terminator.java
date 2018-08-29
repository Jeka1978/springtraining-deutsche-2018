package quoters;


import lombok.Setter;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Benchmark
@Transaction
@DeprecatedClass(alternative = T1000.class)
public class Terminator implements Quoter {
    @Setter
    private List<String> messages;
    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    public void killAll(){
        System.out.println("You are teminated...");
    }
}
