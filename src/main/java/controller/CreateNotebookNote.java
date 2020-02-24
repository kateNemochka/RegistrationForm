package controller;

import model.Model;
import view.View;
import view.ViewConstants;

import java.util.Scanner;

public class CreateNotebookNote implements RegexPatterns, ViewConstants {
    Model model;
    View view;
    Scanner sc;

    public CreateNotebookNote(Model model, View view, Scanner scanner) {
        this.model = model;
        this.view = view;
        this.sc = scanner;
    }

    public void createNote() {
        ScannerUtility su = new ScannerUtility(view, sc);

        view.printMessage(view.localizeString(INITIAL_MESSAGE));

        /* INPUTTING NAME */
        model.setFirstName(su.inputStringValueWithScanner(INPUT_FIRST_NAME,
                localizePattern(NAME_PATTERN_ENG, NAME_PATTERN_UKR), false));
        model.setSecondName(su.inputStringValueWithScanner(INPUT_SECOND_NAME,
                localizePattern(NAME_PATTERN_ENG, NAME_PATTERN_UKR), true));
        model.setLastName(su.inputStringValueWithScanner(INPUT_LAST_NAME,
                localizePattern(SURNAME_PATTERN_ENG, SURNAME_PATTERN_UKR), false));

        /*NICKNAME*/
        model.setNickname(su.inputStringValueWithScanner(INPUT_NICKNAME, NICKNAME_PATTERN, false));

        /*CONTACTS*/
        model.setEmail(su.inputStringValueWithScanner(INPUT_EMAIL, EMAIL_PATTERN, false));
        model.setSkype(su.inputStringValueWithScanner(INPUT_SKYPE, SKYPE_PATTERN, false));
        model.setHomePhone(su.inputStringValueWithScanner(
                INPUT_HOME_PHONE, PHONE_NUMBER_PATTERN, false));
        model.setMobilePhone1(su.inputStringValueWithScanner(
                INPUT_MOBILE1, PHONE_NUMBER_PATTERN, false));
        model.setMobilePhone2(su.inputStringValueWithScanner(
                INPUT_MOBILE2, PHONE_NUMBER_PATTERN, true));

        /*ADDRESS*/
        model.setPostalCode(su.inputStringValueWithScanner(
                INPUT_POSTAL_CODE, POSTAL_CODE_PATTERN, false));
        model.setCity(su.inputStringValueWithScanner(INPUT_CITY,
                localizePattern(CITY_STREET_PATTERN_ENG, CITY_STREET_PATTERN_UKR), false));
        model.setStreet(su.inputStringValueWithScanner(INPUT_STREET,
                localizePattern(CITY_STREET_PATTERN_ENG, CITY_STREET_PATTERN_UKR), false));
        model.setHouseNumber(su.inputStringValueWithScanner(INPUT_HOUSE_NUMBER,
                localizePattern(HOUSE_NUMBER_ENG, HOUSE_NUMBER_UKR), false));
        model.setApartmentNumber(su.inputStringValueWithScanner(INPUT_APARTMENT_NUMBER,
                localizePattern(APARTMENT_NUMBER_ENG, APARTMENT_NUMBER_UKR), true));

        /*COMMENT*/
        model.setComment(su.inputStringValueWithScanner(INPUT_COMMENT, COMMENT_PATTERN, true));

        /*COMPOSITE FIELDS*/
        model.formFullName();
        model.formFullAddress();

        /*INSERTING NOTE INTO NOTEBOOK*/
        model.createNote();
        // TO-DO: add groups
        model.addNewNoteToNotebook();


    }

    private String localizePattern(String english, String ukrainian) {
        return (String.valueOf(view.getResourceBundle().getLocale()).equals("en"))
                ? english
                : ukrainian;
    }
}
