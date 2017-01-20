package jackson.rick.AccessControl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 1/17/17.
 */
public class AccountStatusTest {

    AccountStatus accountStatus;

    @Before
    public void setup() {

        accountStatus = new AccountStatus();
    }

    @Test
    public void getStatusTest() {

        String expected = "Open";
        String actual = accountStatus.getStatus(1);
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: Open", expected,
                actual);
    }
}