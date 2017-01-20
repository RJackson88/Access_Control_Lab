package jackson.rick.AccessControl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 1/17/17.
 */
public class OverdraftPreventionTest {

    OverdraftPrevention odp;

    @Before
    public void setup() {

        odp = new OverdraftPrevention();
    }

    @Test
    public void getStatusTest() {

        String expected = "Enabled";
        String actual = odp.getStatus(1);
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: Enabled", expected,
                actual);
    }
}