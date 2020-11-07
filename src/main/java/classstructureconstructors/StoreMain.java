package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Store product1 = new Store("Váza");
        Scanner sc = new Scanner(System.in);

        System.out.println("Hány darab termék érkezett?");
        product1.store(sc.nextInt());
        System.out.println("Hány terméket adtunk el?");
        product1.dispatch(sc.nextInt());

        System.out.println("Raktáron " + product1.getStock() + " termék maradt.");
    }
}
