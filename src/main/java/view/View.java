package view;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

public class View implements ViewConstants {

    public enum Bundles {
        UKRAINIAN(ResourceBundle.getBundle(RESOURCES_BUNDLE_FILE, new Locale("uk", "UA"))),
        ENGLISH(ResourceBundle.getBundle(RESOURCES_BUNDLE_FILE, new Locale("en", "US")));

        Bundles(ResourceBundle bundle) {
            this.bundle = bundle;
        }

        private ResourceBundle bundle;

        public ResourceBundle getBundle() {
            return bundle;
        }
    }

    private static final String RESOURCES_BUNDLE_FILE = "resources";

    private static ResourceBundle resourceBundle;


    // Localization settings
    public void requestLanguage() {
        System.out.println("Choose the language || Оберіть мову\n1 - English\n2 - Українська");
    }

    public void setLanguage(Locale locale) {
        resourceBundle = ResourceBundle.getBundle(RESOURCES_BUNDLE_FILE, locale);
    }

    public static ResourceBundle getResourceBundle() {
        return resourceBundle;
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
        System.out.println(REQUEST_MESSAGE + " " + inputRequest);
    }

}
