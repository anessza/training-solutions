package statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("A befektetés összege:");
        int fund= sc.nextInt();
        System.out.println("Kamatláb:");
        int interestRate= sc.nextInt();

        Investment invest = new Investment(fund, 8);
        System.out.println("Tőke: " + fund);
        System.out.println("Hozam 50 napra: " + invest.getYield(50));
        System.out.println("Kivett összeg 80 nap után: " + invest.close(80));
        System.out.println("Kivett összeg 90 nap után: " + invest.close(90));

        }
}
