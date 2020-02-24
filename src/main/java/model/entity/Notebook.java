package model.entity;

import model.entity.Note;

import java.util.ArrayList;

public class Notebook {
    private ArrayList<Note> notes;

    public Notebook() {
        notes = new ArrayList<>();
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void addNewNote(Note note) {
        notes.add(note);
    }


}
