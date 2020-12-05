package week06d02;
/*
Hozz létre egy week06d02.Product osztályt melynek adattagjai a név, kategória és ár,
rendre, String, String int. Készíts egy Store osztályt benne egy Product listával,
amit konstruktorban kap meg. Legyen egy getProductByCategoryName(Category), ami
visszaadja, hogy a paraméterül kapott kategóriából hány darab van a listában.
Bónusz: A kategória legyen enum FROZEN,DAIRY,BAKEDGOODS,OTHER felsorolókkal.
 */
public class Product {
    private String name;
    private String category;
    private int price;

    public Product(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

}
