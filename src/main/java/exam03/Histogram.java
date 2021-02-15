package exam03;
/*
Olvass be egy szöveges fájlt soronként, melyben soronkont számok vannak. Majd hozz létre egy stringet,
mely ugyanennyi sort tartalmaz, és annyi csillagot ír ki egymás mellé soronkont, amennyi a bemeneti
fájlban lévő szám.

Azaz a bemeneti fájl:

3
4
1
2

A létrehozott String:

***
****
*
**

Figyelj, hogy az algoritmusod lehetőleg hatékony legyen!

A Histogram osztályba dolgozz, tesztje HistogramTest.
Minden sor után legyen sortörés, az utolsó után is.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {
    public String createHistogram(BufferedReader reader) {

        Path file = Path.of("histogram.txt");

        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            String histogram = "";
            while ((line = br.readLine()) != null) {
                if (Integer.parseInt(line) == 0) {
                    histogram = histogram + "\n";
                } else {
                    for (int i = 0; i < Integer.parseInt(line); i++) {
                        histogram = histogram + "*";
                    }
                    histogram = histogram + "\n";
                }
            }
            return histogram;
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }

    public static void main(String[] args) {
        Histogram histogram = new Histogram();

        try (BufferedReader reader = new BufferedReader(new FileReader("histogram.txt")) ){
            System.out.println(histogram.createHistogram(reader));
        }
        catch (FileNotFoundException e) {
            throw new IllegalStateException("Can't find file", e);
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }
}
