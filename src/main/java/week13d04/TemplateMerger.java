package week13d04;
/*
Írj egy a TemplateMerger osztályba egy public String merge(Path file, List<Employee> employees) metódust,
ami felolvassa a fájlt, melynek tartalma:

Az alkalmazott neve: {nev}, születési éve: {ev}

Nyugodtan beolvashatod egy utasítással!
Majd a visszatérési értékként add vissza soronként az alkalmazottakat, abban a formátumban, mint ahogy
a fájlban van, azaz:

Az alkalmazott neve: John Doe, születési éve: 1980
Az alkalmazott neve: Jack Doe, születési éve: 1990

(Persze ehhez kell egy Employee osztály is a megfelelő attribútumokkal.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {

    public static void employeesList(String name, int birthday, List<Employee> employeeList){
        Employee employee = new Employee(name, birthday);
        employeeList.add(employee);

    }

    public static String merge(Path file, List<Employee> employees){

        try {
            BufferedReader reader = Files.newBufferedReader(file);

            String line = reader.readLine();
                int i = line.indexOf(":");
                String firstAttribute = line.substring(0, i+1);
            System.out.println(firstAttribute);
                int j = line.indexOf(",");
                int k = line.indexOf(":",j);
                String secondAttribute = line.substring(j+2, k+1);
            System.out.println(secondAttribute);

                StringBuilder solved =  new StringBuilder();

                for (Employee item : employees) {
                    solved.append(firstAttribute);
                    solved.append(" ");
                    solved.append(item.getName());
                    solved.append(", ");
                    solved.append(secondAttribute);
                    solved.append(item.getName());
                    solved.append("\n");
                }

                String mergeSolved = solved.toString();
            System.out.println(mergeSolved);

                return mergeSolved;
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }

    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeesList("Andras", 1975, employeeList);
        employeesList("Tamas", 1980, employeeList);
        employeesList("Kinga", 1982, employeeList);
        System.out.println(employeeList.toString());

        Path file = Path.of("template.txt");

        System.out.println(merge(file, employeeList));

    }
}
