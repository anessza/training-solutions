package week05d03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListCounter {

    static int countListOfA(List<String> stringList) {
        List<String> newStringListA = new ArrayList<>();

        for (String item: stringList){
            if ((item.charAt(0)=='a')||(item.charAt(0)=='A')){
                newStringListA.add(item);
            }
        }
        return newStringListA.size();
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        System.out.println("Egy lista 'a' v. 'A' betűvel kezdődő szavainak száma. ");
        System.out.println("Adj meg a lista elemeit (az utolsó elem . legyen :");

        String item = sc.nextLine();
        stringList.add(item);
        while (!(item.equals("."))){
           item = sc.nextLine();
           stringList.add(item);
        }

        System.out.println(countListOfA(stringList));
    }
}
