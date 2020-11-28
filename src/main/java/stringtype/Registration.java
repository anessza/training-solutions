package stringtype;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Adja meg a felhasználó nevét:");
        String username= sc.nextLine();
        System.out.println("Adja meg a jelszavát:");
        String password1= sc.nextLine();
        System.out.println("Adja meg a jelszavát mégegyszer:");
        String password2= sc.nextLine();
        System.out.println("Adja meg az email címét:");
        String email= sc.nextLine();

        UserValidator felhasznalo = new UserValidator(username, password1, password2, email);

        System.out.println("Helyes a felhasználónév? " + felhasznalo.isValidName(username) );
        System.out.println("A jelszavak egyeznek? " + felhasznalo.isValidPassword(password1, password2) );
        System.out.println("Az email cím helyes? " + felhasznalo.isValidEmail(email) );
     }
}
