package week14d03;
/*
Készíts egy diák (Student) osztályt melyben egy diák jegyeit tárolod egy Map-ben.
A map kulcsa a tantárgy, értéke pedig az adott tantárgy jegyeinek listája.
Ezen felül a diáknak legyen neve, melyet konstruktorban kap meg. Legyen benne egy
metódus, ami paraméterül vár egy tantárgyat és egy jegyet, és beírja a jegyet a
megfelelő tantárgyhoz. Készítsd el a ClassNotebook nevű osztályt melyben diákok
listája található. Készíts egy lekérdező metódust a ClassNoteBook osztályban,
legyen a neve sortNotebook mely a diákok listáját ABC sorrendben adja vissza.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Student {
    private String name;
    private Map<String, List<Integer>> marks = new TreeMap<>();

    public Student(String name) {
        this.name = name;
    }

    public Student(Student student) {
        name = student.name;
        marks = new TreeMap<>(student.marks);
    }

    public void addMark(String subject, int mark) {
        if (!marks.containsKey(subject)) {
            marks.put(subject, new ArrayList<>());
        }
        marks.get(subject).add(mark);
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + '{' + marks + '}';
    }
}
