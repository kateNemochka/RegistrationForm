package controller;

import view.View;
import view.ViewConstants;

import java.util.Scanner;

public class ScannerUtility implements ViewConstants {
    View view;
    Scanner sc;

    public ScannerUtility(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public String inputStringValueWithScanner(String request, String regex, Boolean canBeNull) {
        String result = "";
        view.printInputRequest(request);
        if (canBeNull) {
            view.printMessage(view.concatenateStrings(view.localizeString(CASE_NO_INPUT_MESSAGE), NULL_INPUT));
        }
        while(!(sc.hasNext() && (result = sc.next()).matches(regex))) {
            if (canBeNull && result.matches(NULL_INPUT)) {
                return null;
            }
            view.printMessage(view.localizeString(WRONG_INPUT_MESSAGE));
        }
        return result;
    }
}
