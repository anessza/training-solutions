package classstructureconstructors;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book("Ibsen", "Vadkacsa");
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Book:");
        System.out.println("The author: " + book1.getAuthor());
        System.out.println("The title: " + book1.getTitle());

        System.out.println("Add regNumber: ");
        book1.register(sc.nextLine());

        System.out.println("The regNumber: " + book1.getRegNumber());
    }
}
