package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("First bankAccount:");
        String account1= sc.nextLine();
        System.out.println("First owner:");
        String owner1= sc.nextLine();
        System.out.println("First balance:");
        int balance1= sc.nextInt();

        sc.nextLine();

        System.out.println("Second bankAccount:");
        String account2= sc.nextLine();
        System.out.println("Second owner:");
        String owner2= sc.nextLine();
        System.out.println("Second balance:");
        int balance2= sc.nextInt();

        BankAccount firstAccount = new BankAccount(account1, owner1, balance1);
        BankAccount secondAccount = new BankAccount(account2, owner2, balance2);

        System.out.println(firstAccount.getInfo());
        System.out.println(secondAccount.getInfo());

        System.out.println(firstAccount.getOwner() + " deposit (Ft):");
        firstAccount.deposit(sc.nextInt());
        System.out.println(firstAccount.getOwner() + " transfer to " + secondAccount.getOwner() + " (Ft):");
        firstAccount.transfer(secondAccount, sc.nextInt());

        System.out.println(firstAccount.getInfo());
        System.out.println(secondAccount.getInfo());


    }

}
