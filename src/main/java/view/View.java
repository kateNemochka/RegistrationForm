package view;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    enum DefaultLocales {
        UKRAINIAN(new Locale("uk", "UA")),
        ENGLISH(new Locale("en", "US"));

        DefaultLocales(Locale locale) {
            this.locale = locale;
        }

        private Locale locale;

        public Locale getLocale() {
            return locale;
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


    //
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
