package controller;

public interface RegexPatterns {
    String SURNAME_PATTERN_ENG = "^([A-Z][a-z])?[A-Z][a-z]{1,20}$";
    String SURNAME_PATTERN_UKR = "^([А-ЩЮЯІЇ][а-щьюяії']{0,20}[а-щьюяії]\\-?)+$";

    String NAME_PATTERN_ENG = "^[A-Z][a-z]{1,20}$";
    String NAME_PATTERN_UKR = "^[А-ЩЮЯІЇ][а-щьюяії']{0,20}[а-щьюяії]$";

    String NICKNAME_PATTERN = "^[A-Za-z0-9_]{8,20}$";

    String COMMENT_PATTERN = "^[\\d\\w\\s]{0,150}$";

    // Phone format: +38(095)737-48-87
    String PHONE_NUMBER_PATTERN = "^\\+\\d{1,3}\\(\\d{3}\\)\\d{3}\\-\\d{2}\\-\\d{2}$";
    String EMAIL_PATTERN = "^[a-zA-Z0-9\\.\\_]{1,25}@[a-z]+(.[a-z]{2,4})+$";
    String SKYPE_PATTERN = "^[A-Za-z0-9][A-Za-z0-9_\\.]{0,20}[A-Za-z0-9]$";

    String POSTAL_CODE_PATTERN = "^\\d{5}$";
    String CITY_STREET_PATTERN_ENG = "^(([A-Z][a-z])?[A-Z][a-z]{1,20}\\s?)+$";
    String CITY_STREET_PATTERN_UKR = "^([А-ЩЮЯІЇ][а-щьюяії']{0,20}[а-щьюяії](\\s|\\-)?)+$";
    String HOUSE_NUMBER_UKR = "^\\d+[А-ЩЮЯІЇ]?$";
    String HOUSE_NUMBER_ENG = "^\\d+[A-Z]?$";
    String APARTMENT_NUMBER_UKR = "^\\d+[А-ЩЮЯІЇ]?$";
    String APARTMENT_NUMBER_ENG = "^\\d+[A-Z]?$";

    String CONTACT_GROUP_NUMBER = "^\\d$";
}
