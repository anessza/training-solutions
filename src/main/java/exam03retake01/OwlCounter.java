package exam03retake01;
/*
A OwlCounter oszály egy Map<String, Integer> attribútumban tárolja, hogy melyik megyében mennyi
baglyot számoltak a madárszámlálók. A readFromFile() metódussal (paraméterezése, visszatérési
értéke kiderül a tesztesetből) töltsd be az értékeket egy fájlból! A fájl formátuma a következő:

Bács-Kiskun=1000
Baranya=1050
Békés=980
Borsod-Abaúj-Zemplén=600

A getNumberOfOwls() metódus adja vissza a baglyok számát a paraméterként átadott megyében!
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    public static Map<String, Integer> readFromFile(BufferedReader reader){
        Path file = Path.of("owls.txt");

        try{
            reader = Files.newBufferedReader(file);
            String line;
            Map<String, Integer> owls = new HashMap<>();
            while ((line = reader.readLine()) != null) {
            int i = line.indexOf("=");
            owls.put(line.substring(0, i), Integer.parseInt(line.substring(i+1)));
            }
            return owls;
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }

    public static int getNumberOfOwls(String country) {
        Path file = Path.of("owls.txt");
        int owlsInCountry = 0;
        try {
            BufferedReader reader = Files.newBufferedReader(file);
            Map<String, Integer> owls = readFromFile(reader);
            for (String s : owls.keySet()) {
                if (s.equals(country)) {
                    owlsInCountry = owls.get(s);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return owlsInCountry;
    }

    public static void main(String[] args) {
        OwlCounter owlCounter = new OwlCounter();
        Path file = Path.of("owls.txt");

        try (BufferedReader reader = Files.newBufferedReader(file)){
            Map<String, Integer> owls = owlCounter.readFromFile(reader);
            System.out.println(owls);
            System.out.println(getNumberOfOwls("Békés"));
        }
        catch (FileNotFoundException e) {
            throw new IllegalStateException("Can't find file", e);
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }
}
