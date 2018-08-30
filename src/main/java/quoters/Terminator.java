package quoters;


import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Benchmark
@Transaction
@Order(1)
@Genre(GenreType.FILM)
public class Terminator implements Quoter {

    private List<String> messages;

    @Value("${terminator.quotes}")
    protected void setMessages(String[] words) {
        messages = Arrays.asList(words);
    }





    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    public void killAll(){
        System.out.println("You are teminated...");
    }
}
