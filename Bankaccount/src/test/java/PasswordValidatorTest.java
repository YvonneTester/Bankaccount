import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PasswordValidatorTest {

    // setup the test Object once
    private PasswordValidator validator = new PasswordValidator();

    @Test
    public void testPasswordIsValid() {
        // All criteria are met
        assertTrue("Password should be valid", validator.validate("P@ssw0rd1"));
    }

    // add the other 6 tests here

    @Test
    public void testPasswordIsShort() {
        // Password too short
        assertFalse("Password should be longer please", validator.validate("P@ss1"));
    }

    @Test
    public void testPasswordIsLong() {
        // Password too long
        assertFalse("Password should be shorter please", validator.validate("P@ssword1234567890123456"));
    }

    @Test
    public void testPasswordIsNull() {
        // Password is null
        assertFalse("There is no input", validator.validate(""));
    }

    @Test
    public void testPasswordWithoutLetters() {
        // Password without letters
        assertFalse("There is no letters in here", validator.validate("123@!"));
    }

    @Test
    public void testPasswordWithoutDigitsAndSpecialCharacter() {
        // Password without digit
        assertFalse("There is no digits and character in here", validator.validate("RavzaInanc"));
    }

}