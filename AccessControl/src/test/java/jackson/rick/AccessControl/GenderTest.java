package jackson.rick.AccessControl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 1/17/17.
 */
public class GenderTest {

    Gender gender;

    @Before
    public void setup() {

        gender = new Gender();
    }

    @Test
    public void enterGenderPromptTest() {

        String expected = "male";
        String actual = "Male";
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: male", expected,
                actual);
    }

    @Test
    public void enterGenderTest() {

        String expected = "Male";
        String actual = "Male";
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: Male", expected,
                actual);
    }

    @Test
    public void genderEntrySwitchTest() {

        String expected = "Male";
        String actual = gender.genderEntrySwitch("m");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals("I expect the result to be: Male", expected,
                actual);
    }
}