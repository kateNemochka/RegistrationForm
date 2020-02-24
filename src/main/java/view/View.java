package view;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

public class View implements ViewConstants {
    public final Locale UKRAINIAN = new Locale("uk", "UA");
    public final Locale ENGLISH = new Locale("en", "US");

    private static final String RESOURCES_BUNDLE_FILE = "resources";

    private static ResourceBundle resourceBundle;


    // Localization settings
    public void requestLanguage() {
        System.out.println(LANGUAGE_REQUEST);
    }

    public ResourceBundle chooseLanguage(Locale locale) {
        return resourceBundle = ResourceBundle.getBundle(RESOURCES_BUNDLE_FILE, locale);
    }

    public ResourceBundle getResourceBundle() {
        return resourceBundle;
    }

    public String localizeString(String string) {
        return resourceBundle.getString(string);
    }



    // Console output
    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenateStrings(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            result.append(string).append(" ");
        }
        return result.toString();
    }

    public void printInputRequest(String inputRequest) {
        System.out.println(localizeString(REQUEST_MESSAGE) + " " + localizeString(inputRequest));
    }

}
