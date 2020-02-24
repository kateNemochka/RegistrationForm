package regex;

import controller.RegexPatterns;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestRegexSurnameUA implements RegexPatterns {
    @Test
    public void testWithCorrectInput() {
        assertTrue("Немченко".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testWithTwoCapitals() {
        assertFalse("НеМченко".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testWithAllLowercase() {
        assertFalse("немченко".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testWith1stLowAnd3rdCap() {
        assertFalse("неМченко".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testWithDigitsAndSpecialSymbols() {
        assertFalse("Нем900рр--3ло".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testTooShort() {
        assertFalse("Н".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testTooLong() {
        assertFalse("Неммммммммммммммммммммммммммм".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testApostrophe() {
        assertTrue("Лук'яненко".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testApostropheEnding() {
        assertFalse("Лук'яненко'".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testUkrainianLetters() {
        assertTrue("Її".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testSurnameWithTwoWords() {
        assertTrue("Нечуй-Левицький".matches(SURNAME_PATTERN_UKR));
    }
}
