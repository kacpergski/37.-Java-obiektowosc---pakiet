package pl.kacperg;

import pl.kacperg.repositories.NotesRepo;

import java.util.Scanner;

public class NoteApp {
    public static void main(String[] args) {
        NotesRepo notesRepo = new NotesRepo();
        Scanner scanner = new Scanner(System.in,"UTF-8");
         int option;
         do {


        System.out.println("----Notes App------------");
        System.out.println("1. add note");
        System.out.println("2. display all");
        System.out.println("0. Stop");
        option = scanner.nextInt();
        scanner.nextLine();

        switch(option){

            case 1:
                System.out.print("Phone number: ");
                String phoneNumber = scanner.nextLine();
                System.out.print("Date and time: ");
                String dateTime = scanner.nextLine();
                System.out.print("Descripton");
                String description = scanner.nextLine();
                Note note = new Note(phoneNumber,dateTime,description);
                notesRepo.add(note);
                break;
            case 2:
                System.out.println(notesRepo);
                break;
            case 0:

                break;


        }
         } while (option !=0);

    }
}
