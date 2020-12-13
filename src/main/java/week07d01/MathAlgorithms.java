package week07d01;

/*
Készíts egy osztályt a week07d01 csomagba MathAlgorithms néven. Ebben az osztályban legyen egy
isPrime(int x) metódus ami a paraméterül kapott számról eldönti, hogy prím-e vagy sem és ennek
megfelelően true vagy false értékkel tér vissza. Aki már tart ott és tudja mit jelent a static
az nyugodtan implementálhatja a metódust statikus metódusként. Az egyszerűség kedvért a prímeket
most csak a pozitív egész számok körében értelmezzük, így bónuszként rá lehet ellenőrizni, hogy
x>0  és ha nem akkor kivételt dobni. Prímeknek tekintjük azokat számokat melyek csak egyel és
önmagukkal oszthatók, tehát a 2,3,5,7,11,13 stb. Teszt!!
 */

import java.util.Scanner;

public class MathAlgorithms {

    static Boolean isPrime(int x){
        if (x<2)return false;
        for(int i=2;i<x;i++) {
            if(x%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(("Adj meg egy pozitív egész számot, megmondom, hogy prím szám-e?"));
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("A(z) " + x + " prím: " + isPrime(x));
    }
}
