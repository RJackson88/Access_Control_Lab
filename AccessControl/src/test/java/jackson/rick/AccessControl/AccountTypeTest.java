package jackson.rick.AccessControl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 1/17/17.
 */
public class AccountTypeTest {

    AccountType accountType;

    @Before
    public void setup() {

        accountType = new AccountType();
    }

    @Test
    public void validateAccountTypeTest() {

        Boolean expected = true;
        Boolean actual = accountType.validateAccountType("Checking");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: true", expected,
                actual);
    }
}