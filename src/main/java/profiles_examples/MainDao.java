package profiles_examples;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import static profiles_examples.ProfilesConst.PROD;

/**
 * @author Evgeny Borisov
 */
@Repository
@Profile(PROD)
public class MainDao implements Dao {
    @Override
    public void saveAll() {
        System.out.println("Saving to Mongo");
    }
}
