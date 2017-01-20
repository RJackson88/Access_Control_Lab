package jackson.rick.AccessControl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 1/17/17.
 */
public class AccountingTest {

    Accounting accounting;

    @Before
    public void setup() {

        accounting = new Accounting();
    }

    @Test
    public void getCurrentBalanceTest() {

        Double expected = 0.0;
        Double actual = accounting.getCurrentBalance();
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: 0.0", expected,
                actual);
    }

    @Test
    public void transaction() {

        Double expected = 1.88;
        Double actual = accounting.transaction(1.88, 1.00);
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: 1.88", expected,
                actual);
    }
}