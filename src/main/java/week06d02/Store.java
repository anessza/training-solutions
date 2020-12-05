package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static int getProductByCategoryName(List<Product> productList, String category){
        int pieceOfCategory=0;
        for (Product item: productList){
            if (category.equals(item.getCategory())) pieceOfCategory++;
        }
    return pieceOfCategory;
    }

    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();
        Product coat = new Product("coat", "Other", 6);
        Product milk = new Product("milk", "Dairy", 4);
        Product yoghurt = new Product("yoghurt", "Dairy", 10);
        Product icecream = new Product("icecream", "Frozen", 3);
        Product cottageCheese = new Product("cottage cheese", "Dairy", 2);
        listProduct.add(coat);
        listProduct.add(milk);
        listProduct.add(yoghurt);
        listProduct.add(icecream);
        listProduct.add(cottageCheese);

        int pieceOfCategory= getProductByCategoryName(listProduct,"Dairy");

        System.out.println("Dairy: " + pieceOfCategory + " kind of product in list of product.");
    }
}
