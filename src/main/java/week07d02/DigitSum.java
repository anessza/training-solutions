package week07d02;

/*
Készíts egy week07d02.DigitSum osztályt és benne sumOfDigits(int x) metóódus mely
visszaadja a paraméterül kapott szám számjegyeinek összegét! pl.: 123 esetén a
visszatérési érték 6.
 */

import java.util.Scanner;

public class DigitSum {
    static int sumOfDigits(int x){
        String stringX= String.valueOf(x);
        int[] digits = new int[stringX.length()];
        for(int i=0; i<=digits.length; i++) {
            if (i != digits.length) {
                digits[i] = Integer.parseInt(stringX.substring(i, i + 1));
            }
        }

        int sum=0;

        for (int item: digits){
            sum= sum + item;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(("Adj meg egy pozitív egész számot. Megadom a számjegyei összegét:"));
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(sumOfDigits(x));
    }

}
