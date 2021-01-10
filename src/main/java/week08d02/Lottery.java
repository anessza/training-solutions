package week08d02;
/*
Készíts a week08d02 csomagban egy Lottery osztályt, melynek legyen egy
getNumbers() metódusa, ami visszaad egy listát amiben 5 véletlen szám
van 1-90 között, tehát kvázi készíts egy lottósorsoló programot. A
sorrendre nem kell figyelni, a lényeg, hogy a számok különbözők legyenek!
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
   static List<Integer> getNumbers(){
       List<Integer> lotteryNumbers = new ArrayList<Integer>();
       int number=0;
       Random random=new Random();
       for (int i=0; i<5; i++){
           int randomNumber= random.nextInt(90);
           if (randomNumber == number) randomNumber= random.nextInt(90);
           else {
               number=randomNumber;
               lotteryNumbers.add(randomNumber);
           }
       }
       return lotteryNumbers;
   }

    public static void main(String[] args) {
        List<Integer> lotteryNumbers = getNumbers();
        System.out.println(lotteryNumbers);
    }

}
