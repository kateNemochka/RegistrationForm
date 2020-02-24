package controller;

import model.Model;
import view.View;

import java.util.Scanner;

import static view.ViewConstants.ENG_LANG_CONST;
import static view.ViewConstants.UKR_LANG_CONST;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        view.requestLanguage();
        int lang;
        while (sc.hasNextInt()) {
            lang = sc.nextInt();
            if (lang == ENG_LANG_CONST) {
                view.chooseLanguage(view.ENGLISH);
                break;
            }
            else if (lang == UKR_LANG_CONST) {
                view.chooseLanguage(view.UKRAINIAN);
                break;
            }
        }

        CreateNotebookNote createNotebookNote = new CreateNotebookNote(model, view, sc);
        createNotebookNote.createNote();
    }
}
