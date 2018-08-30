package test_with_spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TaxCalculatorConfiguration.class)
public class StupidTests {
    @Test
    public void test8() {
        Assert.assertEquals(2,2);
    }
    @Test
    public void test9() {
        Assert.assertEquals(4,4);
    }
}
