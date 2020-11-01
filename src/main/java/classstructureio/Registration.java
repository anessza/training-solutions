package classstructureio;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your e-mail address?");
        String email = sc.nextLine();
        System.out.println(name);
        System.out.println(email);
    }

}
