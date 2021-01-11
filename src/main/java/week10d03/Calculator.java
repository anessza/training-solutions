package week10d03;
/*
Készítsünk egy Calculator nevű osztályt, melynek van egy
findMinSum(int[] arr) metódusa. A metódus feladata, hogy
kiírja a legkisebb összegeket 4 számból, amiket lehetséges
összerakni az arr tömb elemeiből. Példa: ha az arr tartalma
[1, 3, 5, 7, 9], akkor a minimum összeg 1+3+5+7=16.
 */

import java.util.Arrays;

public class Calculator {
    public static int findMinSum(int[] arr){
        int minSum = 0;
        if (arr.length <= 4) {
            for (int item : arr) {
                minSum = minSum + item;
            }
            return minSum;
        }
        else {
            Arrays.sort(arr);
            minSum = arr[0] + arr[1] + arr[2] + arr[3];
            return minSum;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 75, 3, 11, 5};
        int minSum = findMinSum(arr);
        System.out.println(minSum);
    }
}