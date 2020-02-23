import controller.RegexPatterns;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestRegexContacts implements RegexPatterns {
    @Test
    public void testUkrainianNumber() {
        assertTrue("+38(012)123-45-67".matches(PHONE_NUMBER_PATTERN));
    }
}
