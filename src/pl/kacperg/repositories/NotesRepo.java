package pl.kacperg.repositories;

import pl.kacperg.Note;

import java.util.Arrays;

public class NotesRepo {
    private Note[] notes = new Note [10];
    private int index = 0;

    public void add (Note note){
        if (index >= notes.length){
            index = 0;
        }
         notes[index++] = note;
        }


    @Override
    public String toString() {
        return "NotesRepo{" +
                "notes=" + Arrays.toString(notes) +
                '}';
    }
}
