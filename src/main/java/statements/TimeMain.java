package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Az első időpont (óra):");
        int hours1= sc.nextInt();
        System.out.println("Az első időpont (perc):");
        int minutes1= sc.nextInt();
        System.out.println("Az első időpont (másodperc):");
        int seconds1= sc.nextInt();

        System.out.println("A második időpont (óra):");
        int hours2= sc.nextInt();
        System.out.println("A második időpont (perc):");
        int minutes2= sc.nextInt();
        System.out.println("A második időpont (másodperc):");
        int seconds2= sc.nextInt();

        Time elsoIdopont = new Time(hours1, minutes1, seconds1);
        Time masodikIdopont = new Time(hours2, minutes2, seconds2);

        System.out.println("Az első időpont : " + elsoIdopont.toString() + " = " + elsoIdopont.getInMinutes() + " perc");
        System.out.println("A második időpont : " + masodikIdopont.toString() + " = " + masodikIdopont.getInSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második: " + elsoIdopont.earlierThan(masodikIdopont));
    }
}
