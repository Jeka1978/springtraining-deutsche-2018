package test_with_spring;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class NdsResolverImpl implements NdsResolver {
    @Override
    public double getNds() {
        return 0.18;
    }
}
