package regex;

import controller.RegexPatterns;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestRegexContacts implements RegexPatterns {

    /*PHONE NUMBERS PATTERNS*/
    @Test
    public void testCorrectPhoneNumber() {
        assertTrue("+38 012 123 45 67".matches(PHONE_NUMBER_PATTERN));
    }

    @Test
    public void testIncorrectPhoneNumber() {
        assertFalse("+38 012 123 4567".matches(PHONE_NUMBER_PATTERN));
    }

    /*EMAIL PATTERNS*/
    @Test
    public void testCorrectGmailAddress() {
        assertTrue("k.nemch99@gmail.com".matches(EMAIL_PATTERN));
    }

    @Test
    public void testCorrectFITAddress() {
        assertTrue("k_nemch99@fit.knu.ua".matches(EMAIL_PATTERN));
    }

    @Test
    public void testEmailAddressWithInvalidSymbols() {
        assertFalse("k)&jvgj@gmail.com".matches(EMAIL_PATTERN));
    }

    /*SKYPE PATTERNS*/
    @Test
    public void testCorrectSkype() {
//        assertTrue();
    }
}
