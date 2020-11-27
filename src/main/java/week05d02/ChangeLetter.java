package week05d02;

import java.util.Scanner;

public class ChangeLetter {

    static String changeVowels(String string){
        StringBuilder backString = new StringBuilder();
        String newString=string;

        String[] vowels = new String[]{"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for (String item: vowels){
              String c=item;
              newString = newString.replace(c, "*");
        }
        backString = backString.append(newString);
        return backString.toString();
        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Tetszőleges szövegben az angol ABC magánhangzóit * karakterre cserélem.");
        System.out.println("Adj meg ehhez egy szöveget :");
        String szoveg= sc.nextLine();

        String ujSzoveg = changeVowels(szoveg);
        System.out.println(ujSzoveg);
    }
}
