package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number?");
        int a = sc.nextInt();
        System.out.println("Second number?");
        int b = sc.nextInt();
        System.out.println(a +" + "+ b);
        System.out.println(a+b);
    }
}
