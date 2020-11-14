package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Kérek egy egész számot: ");
        int egesz= sc.nextInt();
        double osztas = (double) egesz/3;
        boolean oszthatoHarommal = (osztas - (int) osztas == 0);

        System.out.println("A(z) " + egesz + " osztahó 3-mal = " + oszthatoHarommal);

    }
}
