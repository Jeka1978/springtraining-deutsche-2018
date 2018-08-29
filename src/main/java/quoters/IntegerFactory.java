package quoters;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.FactoryBean;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public class IntegerFactory implements FactoryBean<Integer> {

    private int max;
    @Override
    public Integer getObject() throws Exception {
        // go to db and find my int
        return new Random().nextInt(max);
    }

    @Override
    public Class<?> getObjectType() {
        return Integer.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
