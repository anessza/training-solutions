package week05d04;

import java.time.LocalDate;

public class Product {
    private String name;
    private LocalDate expirationDate;

    public Product(String name, int year, int month, int day) {
        this.name = name;
        expirationDate = LocalDate.of(year, month, day);
    }
    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

}