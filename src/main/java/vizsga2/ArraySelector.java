package vizsga2;
/*
Írj egy olyan metódust az ArraySelector osztályban, mely egy kapott tömbből minden második
elemet kiválogat, és egy szövegként összerak, szögletes zárójelek között!
A páros megállapítása index szerint működik. Azaz az első, nulla indexű
elem páros, a második, azaz egyes indexű elem páratlan, stb.
Ha nulla elemű a tömb, akkor üres stringet adjon vissza!
 */

import java.util.ArrayList;
import java.util.List;

public class ArraySelector {
    static String arraySelector(String [] array) {
        if (array.length == 0) return null;
        else {
            List<String> newStringList = new ArrayList<>();
            for (int i=0; i< array.length;i++) {
                if ((i % 2) == 0) {
                    newStringList.add(array[i]);
                }
            }
            String newString = newStringList.toString();
            return newString.replace(", ", "");
        }
    }


    public static void main(String[] args) {

        String[] test= {"Alma","Körte","Dinnye","Paprika","Paradicsom","Répa", "Banán"};

        String newList= arraySelector(test);
        System.out.println(newList);

    }
}



