package classstructureattributes;
import java.util.Scanner;
public class Music {
    public static void main(String[] args) {
        Song song1 = new Song();
        Scanner sc = new Scanner(System.in);
        System.out.println("Favorite band:");
        song1.band = sc.nextLine();
        System.out.println("Favorite song title:");
        song1.title = sc.nextLine();
        System.out.println("Song length in minute:");
        song1.length = sc.nextInt();

        System.out.println(song1.band + " - " + song1.title + " (" + song1.length + " perc)");
    }
}
