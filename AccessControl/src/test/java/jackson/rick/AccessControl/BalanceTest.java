package jackson.rick.AccessControl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by rickjackson on 1/17/17.
 */
public class BalanceTest {

    Balance balance;

    @Before
    public void setup() {

        balance = new Balance();
    }

    @Test
    public void openAccountBalanceTest() {

        Double expected = 0.00;
        Double actual = balance.openAccountBalance();
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: 0", expected,
                actual);
    }

    @Test
    public void getBalanceTest() {

        Double expected = 0.00;
        Double actual = balance.getBalance();
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: 0.0", expected,
                actual);
    }

    @Test
    public void balanceInquiryTest() {

        String expected = "Balance inquiry is not allowed while account is under " +
                "OFAC Freeze.";
        String actual = balance.balanceInquiry("OFAC Freeze");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: Balance inquiry is not " +
                        "allowed while account is under OFAC Freeze.", expected,
                actual);
    }

    @Test
    public void creditTest() {

        String expected = "Transaction Cannot Be Completed";
        String actual = balance.credit(1.00, "Closed");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: Transaction Cannot Be " +
                        "Completed", expected, actual);
    }

    @Test
    public void debitTest() {

        String expected = "Transaction Cannot Be Completed";
        String actual = balance.debit(1.00, "Closed");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: Transaction Cannot Be " +
                        "Completed", expected, actual);
    }
}