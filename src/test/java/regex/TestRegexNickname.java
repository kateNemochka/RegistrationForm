package regex;

import controller.RegexPatterns;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestRegexNickname implements RegexPatterns {

    @Test
    public void nicknameTooShort_lessThan8_False() {
        assertFalse("Kate".matches(NICKNAME_PATTERN));
    }

    @Test
    public void nicknameTooLong_moreThan20_False() {
        assertFalse("vjekjeqvgh3quhgjrghkhqefjhw34ghuhfwhfg34ughugh34uh3".matches(NICKNAME_PATTERN));
    }

    @Test
    public void nicknameWithIncorrectSymbols_False() {
        assertFalse("helL0(java".matches(NICKNAME_PATTERN));
        assertFalse("helL0@java".matches(NICKNAME_PATTERN));
    }

    @Test
    public void nicknameWithCorrectSymbolsAndLength_True() {
        assertTrue("k0ra_N3m".matches(NICKNAME_PATTERN));
    }

}
