package week07d03;

/*
A week07d03 csomagban hozz létre egy NumberList osztályt.
Ennek legyen egy metódusa isIncreasing(List<Integer>) mely
egy számokból álló listát vár paraméterül és megnézi, hogy
a listában a számok növekvő sorrendben szerepelnek-e és
ennek megfelelően igaz vagy hamis értékkel tér vissza.
Speciális eset ha két egymást követő szám egyenlő, ez nem
probléma a 1,2,3,3,3,5 számokat növekvőnek tekintjük.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberList {

    static boolean isIncreasing(List<Integer> intList){
        int length= intList.size();
        for (int i=0; i<(length-1); i++){
            if (intList.get(i)>intList.get(i+1)) return false ;
            }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> newIntList = new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        System.out.println("Adj meg egy pozitív egészeket tartalmazó lista elemeit (az utolsó elem -1 legyen) :");

        Integer item = sc.nextInt();
        newIntList.add(item);
        while(!(item==-1)){
            item = sc.nextInt();
            if (item!=-1) newIntList.add(item);
        }

        System.out.println("Ez a lista növekvő: " + isIncreasing(newIntList));
    }
}
