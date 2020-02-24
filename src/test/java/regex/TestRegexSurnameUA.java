package regex;

import controller.RegexPatterns;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestRegexSurnameUA implements RegexPatterns {
    @Test
    public void testUkrainianSurnameWithCorrectInput() {
        assertTrue("Немченко".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testUkrainianSurnameWithTwoCapitals() {
        assertFalse("НеМченко".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testUkrainianSurnameWithAllLowercase() {
        assertFalse("немченко".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testUkrainianSurnameWith1stLowAnd3rdCap() {
        assertFalse("неМченко".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testUkrainianSurnameWithDigitsAndSpecialSymbols() {
        assertFalse("Нем900рр--3ло".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testUkrainianSurnameTooShort() {
        assertFalse("Н".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testUkrainianSurnameTooLong() {
        assertFalse("Неммммммммммммммммммммммммммм".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testUkrainianSurnameApostrophe() {
        assertTrue("Лук'яненко".matches(SURNAME_PATTERN_UKR));
    }

    @Test
    public void testUkrainianSurnameApostropheEnding() {
        assertFalse("Лук'яненко'".matches(SURNAME_PATTERN_UKR));
    }
}
