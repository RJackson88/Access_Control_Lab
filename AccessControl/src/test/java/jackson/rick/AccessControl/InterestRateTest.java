package jackson.rick.AccessControl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by rickjackson on 1/17/17.
 */
public class InterestRateTest {

    InterestRate interestRate;

    @Before
    public void setup() {

        interestRate = new InterestRate();
    }

    @Test
    public void getInterestRateTest() {

        Double expected = 0.01;
        Double actual = interestRate.getInterestRate(1);
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: 0.01", expected,
                actual);
    }
}