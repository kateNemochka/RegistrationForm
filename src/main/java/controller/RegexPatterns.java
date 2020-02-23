package controller;

public interface RegexPatterns {
    String SURNAME_PATTERN_ENG = "^([A-Z][a-z])?[A-Z][a-z]{1,20}$";
    String SURNAME_PATTERN_UKR = "^[А-ШЮЯ][а-шьюя'\\-]{0,18}[а-шьюя]{1}$";

    String FIRST_NAME_PATTERN_ENG = "^[A-Z][a-z]{1,20}$";
    String FIRST_NAME_PATTERN_UKR = "^[А-ШЮЯ][а-шьюя']{0,19}$";

    String NICKNAME_PATTERN = "^[A-Za-z0-9_]{8,20}$";

    String COMMENT_PATTERN = "^[\\d|\\w|\\s]{0,150}$";

    // Phone format: +38(095)737-48-87
    String PHONE_NUMBER_PATTERN = "^\\+\\d{1,3}\\(\\d{3}\\)\\d{3}\\-\\d{2}-\\d{2}$";
    String EMAIL_PATTERN = "^[a-zA-Z0-9\\.\\_]{1,25}@[]\\.[a-z]{2,4}$";
    String SKYPE_PATTERN = "";

    String POSTAL_CODE_PATTERN = "";
    String CITY_STREET_PATTERN = "";
    String HOUSE_NUMBER = "";
    String APARTMENT_NUMBER = "";

    String DATE_ADDED_PATTERN = "";
    String DATE_MODIFIED_PATTERN = "";
}
