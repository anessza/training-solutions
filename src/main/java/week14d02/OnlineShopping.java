package week14d02;
/*
Adott egy fájl melyben online bevásárlások találhatók. A fájl a még ki nem szállított rendeléseket tartalmazza.
Egy sorban egy egyedi azonosító és utána a termékek neve van felsorololva. Minden vásárlás legalább 2 termékből áll.

A233 bread,tomato,flour,sugar
A312 sugar,beer,apple,pear
B3402 meet,soda,cola,bbq_sauce
B341 pasta,passata,basil,cheese
A10 corn,hot_dog,rolls
CM231 beer,chips
C123 pepper,salt,rosmary,pizza_dough,passata,oregano
W34111 pasta,sugar,rosmary,cheese,meet,carrot,potato,tomato
K8921 wine,soda

Olvasd be a fájlt és tárold el az adatokat a memóriában, majd oldd meg a következő feladatokat.

    - Egyedi azonosító alapján legyenek lekérdezhetőek a vásárolt termékek ABC sorrendben.
    - Számoljuk össze, egy termék neve alapján, hogy abból a termékből mennyit adtak el.
    - Adjuk vissza egy vásárlási azonosító alapján, hogy hány termék szerepel a vásárlásban.
    - Készíts statisztikát melyben visszaadod, hogy az egyes termékek hányszor szerepelnek a fájlban.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OnlineShopping {

    public static Map<String, List<String>> index(Path file) {
        Map<String, List<String>> indexList = new HashMap<>();
        List<String> shoppingList = new ArrayList<>();

        try {
            BufferedReader reader = Files.newBufferedReader(file);
            String line;

            while ((line = reader.readLine()) != null) {
                int i = line.indexOf(" ");
                String index = line.substring(0, i);
                String shopping = line.substring(i+1);
                String[] shoppingItems = shopping.split(",");
                for (int j = 0; j < shoppingItems.length; j++) {
                    shoppingList.add(shoppingItems[j]);
                }

                if (shopping == null) return indexList;

                for (String item : shoppingItems) {
                    if (!indexList.containsKey(index)) {
                        indexList.put(index, new ArrayList<>());
                    }
                    indexList.get(index).add(item);
                }
            }
            return indexList;
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }

    public static List<String> getShoppingItems(String index, Map<String, List<String>> indexList ) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, List<String>> stringListEntry : indexList.entrySet()) {
            if (stringListEntry.getKey().equals(index)) {
                for (String s : stringListEntry.getValue()) {
                    list.add(s);
                }
            }
        }
        list.sort(Comparator.comparing(Function.identity()));
        return list;
    }

    public static int countItems(String item, Map<String, List<String>> indexList) {
        long count = 0L;
        for (List<String> strings : indexList
                .values()) {
            for (String a : strings) {
                if (a.equals(item)) {
                    count++;
                }
            }
        }
        return (int) count;
    }

    public static int countItemsByIndex(String index, Map<String, List<String>> indexList) {
        if (indexList.containsKey(index)) {
            return indexList.get(index).size();
        }
        return 0;
    }

    public static Map<String, Long> statistic(Map<String, List<String>> indexList) {
        Map<String, Long> map = new HashMap<>();
        for (List<String> shoppingItems : indexList.values()) {
            for (String item : shoppingItems) {
                map.merge(item, 1L, Long::sum);
            }
        }
        return map;
    }


    public static void main(String[] args) {
        Path file = Path.of("\\training\\training-solutions\\onlineshopping.txt");
        System.out.println(index(file).toString());
        System.out.println(getShoppingItems("C123", index(file)).toString());
        System.out.println(countItems("beer",index(file)));
        System.out.println(countItemsByIndex("C123", index(file)));
        System.out.println(statistic(index(file)));
    }
}
