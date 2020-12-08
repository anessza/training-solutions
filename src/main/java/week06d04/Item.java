package week06d04;

import java.time.LocalDate;

public class Item {

    private final int price;
    private final LocalDate date;
    private final String name;

    public Item(int price, int year, int month, int day, String name) {
        this.price = price;
        this.name = name;
        date= LocalDate.of(year, month, day);
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

}
