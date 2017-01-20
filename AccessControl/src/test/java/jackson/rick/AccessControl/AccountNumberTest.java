package jackson.rick.AccessControl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 1/17/17.
 */
public class AccountNumberTest {

    AccountNumber accountNumber;

    @Before
    public void setup() {

        accountNumber = new AccountNumber();
    }

    @Test
    public void getCurrentGeneratedNumberTest() {

        Integer expected = 1;
        Integer actual = accountNumber.getCurrentGeneratedNumber();
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: 1", expected,
                actual);
    }

    @Test
    public void createNewAccountTest() {

        String expected = "0000000001";
        String actual = accountNumber.createNewAccount();
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: 0000000001", expected,
                actual);
    }

    @Test
    public void accountNumberFormatTest() {

        String expected = "0000000001";
        String actual = accountNumber.accountNumberFormat(1);
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: 0000000001", expected,
                actual);
    }


}