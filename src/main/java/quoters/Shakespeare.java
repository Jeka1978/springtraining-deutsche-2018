package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static quoters.GenreType.BOOK;

/**
 * @author Evgeny Borisov
 */
@Order(20)
@Genre(BOOK)
public class Shakespeare implements Quoter {
    @Value("${shake}")
    private String message;


    @Value("${пофиг}")
    public void setX(@Value("${JAVA_HOME}")String javaHome, @Value("${M2_HOME}") String m2){
        System.out.println("javaHome = " + javaHome);
        System.out.println("m2 = " + m2);
    }


    @InjectRandomInt(min = 3, max = 5)
    private int repeat;


    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}







