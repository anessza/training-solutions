package week11d04;
/*
Adott az aktuális könyvtárban több, fájl, melynek a nevei:
number00.txt, number03.txt, number20.txt, egészen 99-ig.
Nem minden fájl létezik, lehet, hogy bizonyos számhoz tartozó
fájl kimaradt. Olvasd be az állományból a benne lévő számot,
és ezt összegezd! Használd a Files.isRegularFile() metódust arra,
hogy megnézd, létezik-e a fájl! Használd a Files.readString()
metódust a fájl beolvasására! A FilesSum osztály int sumNumbers()
metódusába dolgozz!
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {
public static int readFile(String fileName){
    Path path = Path.of(fileName);
    try {
        String fileContent = Files.readString(path);
        int number = Integer.parseInt(fileContent);
        return number;
    } catch (IOException e) {
        throw new IllegalStateException("Can't read file", e);
    }
}

public static int sumNumber(){
    int sum = 0;
    for (int i=0; i < 100; i++) {
        //String fileName = "number" + (((i < 10) ? ("0" + i) : i) + ".txt";
        String fileName = String.format("number%02d.txt", i);

        if (Files.isRegularFile(Path.of(fileName))){
            int number = readFile(fileName);
            sum = sum + number;
        }
    }
    return sum;
}

    public static void main(String[] args) {
        System.out.println(sumNumber());
    }
}
