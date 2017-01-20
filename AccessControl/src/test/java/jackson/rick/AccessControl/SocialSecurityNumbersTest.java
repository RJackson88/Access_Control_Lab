package jackson.rick.AccessControl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 1/17/17.
 */
public class SocialSecurityNumbersTest {

    SocialSecurityNumbers ssn;

    @Before
    public void setup() {

        ssn = new SocialSecurityNumbers();
    }

//    @Test
//    public void enterSocialSecurityNumberTest() {
//
//        String expected = "123-45-6789";
//        String actual = ssn.enterSocialSecurityNumber();
//        System.out.println("Expected: " + expected);
//        System.out.println("Actual:   " + actual);
//        assertEquals("I expect the result to be: 123-45-6789", expected,
//                actual);
//    }


}