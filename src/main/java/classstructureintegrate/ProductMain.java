package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Product name?");
        String name = sc.nextLine();
        System.out.println("Product price?");
        int price = sc.nextInt();

        Product product1 = new Product(name, price);

        System.out.println("Product and price:");
        System.out.println(product1.getName() + " : " + product1.getPrice() + " HUF");

        System.out.println("Increase (HUF):");
        product1.increasePrice(sc.nextInt());
        System.out.println("Decrease (HUF):");
        product1.decreasePrice(sc.nextInt());

        System.out.println("Now the product price: " + product1.getPrice() + " HUF.");
    }

}
