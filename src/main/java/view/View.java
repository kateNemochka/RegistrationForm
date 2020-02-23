package view;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

public class View {


    private static final String RESOURCES_BUNDLE_FILE = "resources";
    private ResourceBundle resourceBundle;




    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenateStrings(ArrayList<String> strings) {
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            result.append(string);
        }
        return result.toString();
    }
}



enum DefaultLocales {
    UKRAINIAN("uk", "UA"),
    ENGLISH("en", "US");

    DefaultLocales(String language, String country) {
        locale = new Locale(language, country);
    }
    private Locale locale;

    public Locale getLocale() {
        return locale;
    }
};
