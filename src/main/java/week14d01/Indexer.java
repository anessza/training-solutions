package week14d01;
/*
Készíts egy Indexer osztályt, melynek van egy public Map<Character, List<String>> index(List<String> names) metódusa.
A feladat az, hogy egy indexet készítsünk a megadott nevek kezdőbetűiből (minden kezdőbetűt társítsunk az összes névvel,
mely ezzel a betűvel kezdődik). Példa:

System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")));
// {A=[Abraham], L=[Lujza], M=[Magdolna], O=[Odon]}

 */

import java.util.*;

public class Indexer {
    public Map<Character, List<String>> index(List<String> names) {
        Map<Character, List<String>> indexList = new HashMap<>();
        if (names == null) return indexList;

        for (String name : names) {
            Character firstletter = name.toUpperCase().charAt(0);
            if (!indexList.containsKey(firstletter)) {
                indexList.put(firstletter, new ArrayList<>());
            }
            indexList.get(firstletter).add(name);
        }
        return indexList;
    }


    public static void main(String[] args) {

        System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")));
    }
}
