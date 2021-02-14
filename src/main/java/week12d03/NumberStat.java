package week12d03;
/*
Készítsd el a week12d03.NumberStat osztályt melyben legyen egy metódus, ami paraméterül
vár egy egész számokból álló listát. Add vissza azt a számot amelyik pontosan egyszer
szerepel a listában. Ha több ilyen szám van akkor a kisebbet! Ellenőrizd, hogy olyan
listát fogadunk el, ami legalább 1 elemű, ha a lista nem ilyen, dobj kivételt!
pl: {1,1,5,3,4,5,6,5,6,4,1,6,5,4} A megoldás: 3 Bónusz: Módosítsd az osztályt.
Legyen egy egész számokból álló lista attribútuma. A fent megírt metódus ezen a listán
dolgozzon. A lista elemeit fájlból töltsük fel. A file úgy néz ki, hogy egy sorban három
szám van vesszővel elválasztva. Tehát:

1,1,4
2,3,5
2,2,5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class NumberStat {
    private List<Integer> numbers = new ArrayList<>();

    public int findSmallestUnique(){
        if (numbers.size() < 1){
            throw new IllegalStateException("Attribute is empty");
        }
        if (numbers.size() == 1){
            return numbers.get(0);
        }
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);
        System.out.println(sortedNumbers);
        if (numbers.get(0) != numbers.get(1)){
            return numbers.get(0);
        }
        int minimum = numbers.get(0);
        int db = 0;
        for (int i= 1; i < numbers.size()-1; i++){
            if (!Objects.equals(numbers.get(i-1), numbers.get(i)) && !Objects.equals(numbers.get(i+1), numbers.get(i)) ) {
                minimum = numbers.get(i);
                return minimum;
            }

            }
        return minimum;
        }





    public void readFromFile(String fileName) {
        Path file = Path.of(fileName);
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                addNumbers(temp);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Can't read file");
        }
    }

    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }

    private void addNumbers(String[] temp) {
        for (String item : temp) {
            numbers.add(Integer.parseInt(item));
        }
    }
}
