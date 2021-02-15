package week13d01;
/*
A GitHubon a examples\week13d01\src\main\resources\iranyitoszamok-varosok-2021.csv
fájl tartalmazza a magyar városok listáját. Add vissza a leghosszabb nevű várost!
https://github.com/Training360/strukturavalto-java-public/blob/master/examples/week13d01/src/main/resources/iranyitoszamok-varosok-2021.csv
 */

import week12d05.Covid;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class City {
    public String longestLine(String path){
        Path url = Path.of(path);
        try (BufferedReader br = Files.newBufferedReader(url)) {
            String line;
            String longestLine = null;
            int lenght = 0;

            while((line = br.readLine()) != null){
                if (line.length() > lenght){
                    lenght = line.length();
                    longestLine = line;
                }
            } return longestLine;
        }
        catch (IOException e){
            throw new IllegalStateException("Can't read file", e);
        }
    }

    public static void main(String[] args) {
        City city = new City();
        System.out.println(city.longestLine("iranyitoszamok.csv"));
    }

}
