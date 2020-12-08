package week06d04;

import java.util.ArrayList;
import java.util.List;

/*
Készíts az week06d04 csomagban egy Budget osztályt, amely a konstruktorában Item példányokat
vár listában (List). Az Item tartalmazza az alábbi attribútumokat: int price, int month,
String name. A Budget osztály tárolja el egy attribútumban a konstruktorban megkapott items
listát. Írjunk egy metódust, getItemsByMonth néven, mely egy hónapot vár (1-12) és visszaadja
az Itemeket az adott hónapban! Bónusz feladat: ellenőrizzük a bemeneti paramétereket és írjunk
tesztet!
 */
public class Budget {
    private static List<Item> items;

    public Budget(List<Item> items) {
        this.items = items;
    }

    public static List<Item> getItems() {
        return items;
    }

    public static List<Item> getItemsByMonth(int month) {
        List<Item> solved = new ArrayList<>();
        for (Item item : Budget.items) {
            if (item.getDate().getMonthValue() == month) {
                solved.add(item);
            }
        }
        return solved;
    }


    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        Item coat = new Item(200, 2020, 12, 8, "Kabát");
        items.add(coat);
        Item cardigan = new Item(300, 2020, 11, 15, "Kardigán");
        items.add(cardigan);
        Item tShirt = new Item(80, 2020, 12, 1, "Póló");
        items.add(tShirt);
        Item skirt = new Item(120, 2020, 12, 6, "Szoknya");
        items.add(skirt);
        Budget budget = new Budget(items);
        Budget solved = new Budget(budget.getItemsByMonth(12));

        for (int i=0; i < getItems().size(); i++) {
            System.out.println("Decemberi termékek és az áruk: ");
            System.out.println((getItems().get(i).getName() + " : " + getItems().get(i).getPrice()) + " EUR");
        }
    }
}