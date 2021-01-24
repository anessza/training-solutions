package week11d01;
/*
Készítsünk egy DivisorFinder nevű osztályt, melynek van egy
int findDivisors(int n) metódusa. A feladat az, hogy megnézzük
a szám minden egyes számjegyére, hogy osztója-e a számnak, majd
számoljuk össze őket. Példa: a 425-ben az 5 osztója a számnak,
ezért a visszatérési érték 1.
 */

public class DivisorFinder {
    public static int findDivisors(int n) {
        int i=0;
        String[] nStr = Integer.toString(n).split("");

        for(String item : nStr){
            if (Integer.parseInt(item) == 0) continue;
            else if (n%(Integer.parseInt(item))== 0) i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int n = 600;
        int i= findDivisors(n);
        System.out.println(i);
    }
}
