package classsctructuremethods;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client1 = new Client();
        Scanner sc = new Scanner(System.in);

        System.out.println("First client name:");
        client1.setName(sc.nextLine());
        System.out.println("First client address:");
        client1.setAddress(sc.nextLine());
        System.out.println("First client birth year:");
        client1.setYear(sc.nextInt());
        sc.nextLine();


        System.out.println("Eredeti adatok:" + client1.getName() + " " + client1.getYear() + " " + client1.getAddress());
        System.out.println("What is your new address?");
        client1.migrate(sc.nextLine());

        System.out.println("Módostott adatok: " + client1.getName() + " " + client1.getYear() + " " + client1.getAddress());
    }
}
