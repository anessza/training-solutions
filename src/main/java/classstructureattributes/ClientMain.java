package classstructureattributes;
import java.util.Scanner;
public class ClientMain {

    public static void main(String[] args) {
        Client client1 = new Client();
        Scanner sc = new Scanner(System.in);
        System.out.println("First client name:");
        client1.name = sc.nextLine();
        System.out.println("First client address:");
        client1.address = sc.nextLine();
        System.out.println("First client birth year:");
        client1.year = sc.nextInt();

        System.out.println(client1.name + "\n" + client1.year + "\n" + client1.address);
    }
}