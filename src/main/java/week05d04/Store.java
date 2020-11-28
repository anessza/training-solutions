package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {

        static void addProduct(List<Product> productList){

            Scanner sc = new Scanner(System.in);

            System.out.println("A termék neve:");
            String name = sc.nextLine();
            System.out.println("A lejárati dátum(yyyy.mm.dd. formátumban):");
            String expirationDate = sc.nextLine();

            int year= Integer.parseInt(expirationDate.substring(0, 4));
            int month= Integer.parseInt(expirationDate.substring(5, 7));
            int day= Integer.parseInt(expirationDate.substring(8, 10));

            Product product = new Product(name, year, month, day);

            productList.add(product);
        }

        static int getNumberOfExpired(List<Product> productList){
            int i=0;
            for (Product elements: productList){
                if (elements.getExpirationDate().isBefore(LocalDate.now())) i++;
            }
          return i;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Hány terméket akarunk hozzáaadáni a listához?:");
            int item  = sc.nextInt();

            List<Product> productList = new ArrayList<>();

            for (int i=0; i!=item; i++){
                addProduct(productList);
            }
            for (Product elements: productList){
                System.out.println(elements.getName() + ": " + elements.getExpirationDate());
            }
            System.out.println("Lejárt szavatosságú termék: " + getNumberOfExpired(productList));
    }
}
