package model;

import java.util.ArrayList;

public class Notebook {
    private ArrayList<Note> notes;

    public Notebook() {
        notes = new ArrayList<Note>();
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void addNewNote(Note note) {
        notes.add(note);
    }


}
