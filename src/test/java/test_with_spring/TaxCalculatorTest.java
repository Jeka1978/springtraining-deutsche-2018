package test_with_spring;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import quoters.Transaction;

import javax.annotation.PostConstruct;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TaxCalculatorConfiguration.class)
public class TaxCalculatorTest {
    @Autowired
    TaxCalculator taxCalculator;

    @Before
    public void setUp() throws Exception {
        System.out.println("postconstructed");
    }

    public TaxCalculatorTest() {
        System.out.println("test object was created");
    }


    @Test
    public void withNds() {
        double withNds = taxCalculator.withNds(100);
        Assert.assertEquals(118,withNds,0.00001);
    }

    @Test
    public void test1() {
        Assert.assertEquals(1,1);
    }
}



