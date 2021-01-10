package week08d05;
/*
A week08d05 csomagban készíts egy osztályt MathAlgorithms néven.
Legyen benne egy metódus, greatestCommonDivisor(), ami paraméterül
vár két pozitív egész számot és visszaadja a legnagyobb közös osztójukat.
 */
import java.util.Random;

public class MathAlgorithms {
    public static int greatestCommonDivisor(int a, int b){
      int maxDivisor =1;
      for (int i=2; i<=Math.min(a,b); i++){
          if (((a % i) ==0) && ((b % i) ==0) ) maxDivisor = i;
      }
      return maxDivisor;
    }


    public static void main(String[] args) {
        Random random=new Random();
        int randomA = random.nextInt(30);
        int randomB = random.nextInt(30);
        int maxDivisor = greatestCommonDivisor (randomA, randomB);
        System.out.println(randomA + " és " + randomB + " legnagyobb közös osztója: " + maxDivisor);
    }
    }