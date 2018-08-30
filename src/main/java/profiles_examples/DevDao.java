package profiles_examples;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import static profiles_examples.ProfilesConst.DEV;

/**
 * @author Evgeny Borisov
 */
@Repository
@Profile(DEV)
public class DevDao implements Dao {



    @Override
    public void saveAll() {
        System.out.println("Saving to H2");
    }
}
