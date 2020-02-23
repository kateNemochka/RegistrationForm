import controller.RegexPatterns;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestRegexSurnameENG implements RegexPatterns {
    @Test
    public void testEnglishSurnameWithCorrectInput() {
        assertTrue("Skywalker".matches(SURNAME_PATTERN_ENG));
    }

    @Test
    public void testEnglishSurnameWithTwoCapitals() {
        assertTrue("McDonald".matches(SURNAME_PATTERN_ENG));
    }

    @Test
    public void testEnglishSurnameWithAllLowercase() {
        assertFalse("skywalker".matches(SURNAME_PATTERN_ENG));
    }

    @Test
    public void testEnglishSurnameWith1stLowAnd3rdCap() {
        assertFalse("mcDonald".matches(SURNAME_PATTERN_ENG));
    }

    @Test
    public void testEnglishSurnameWithDigitsAndSpecialSymbols() {
        assertFalse("0gdj---".matches(SURNAME_PATTERN_ENG));
    }

    @Test
    public void testEnglishSurnameTooShort() {
        assertFalse("S".matches(SURNAME_PATTERN_ENG));
    }

    @Test
    public void testEnglishSurnameTooLong() {
        assertFalse("Skywaljjjjjjjjjjjjjjjjjjjjjjjjjker".matches(SURNAME_PATTERN_ENG));
    }
}
