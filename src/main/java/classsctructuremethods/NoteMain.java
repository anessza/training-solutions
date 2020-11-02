package classsctructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Note note1 = new Note();
        Scanner sc = new Scanner(System.in);

        System.out.println("Your name:");
        note1.setName(sc.nextLine());
        System.out.println("Your topic:");
        note1.setTopic(sc.nextLine());
        System.out.println("Your text:");
        note1.setText(sc.nextLine());

        System.out.println("The first note data: " + note1.getNoteText());
    }
}
