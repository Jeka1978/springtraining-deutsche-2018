package test_with_spring;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class TaxCalculator {
    private final NdsResolver resolver;

    public double withNds(double price) {
        return price + price * resolver.getNds();
    }
}
