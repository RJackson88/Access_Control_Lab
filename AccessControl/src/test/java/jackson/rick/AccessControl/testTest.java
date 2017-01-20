package jackson.rick.AccessControl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by rickjackson on 1/17/17.
 */

public class testTest {

    test testing;

    @Before
    public void setup() {

    testing = new test();
    }

    @Test
    public void add() {

        Integer expected = 1111;
        String actual = testing.add();
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: 1111", expected,
                actual);
    }
} /* */