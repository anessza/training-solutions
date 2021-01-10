package week09d03;

import java.util.ArrayList;
import java.util.List;

public class SantaClausMain {

    public static void main(String[] args) {
        Person personAndras = new Person("András", 45);
        Person personBea = new Person("Bea", 14);
        Person personDori = new Person("Dóri", 6);
        List<Person> personList = new ArrayList<>();
        personList.add(personAndras);
        personList.add(personBea);
        personList.add(personDori);
        SantaClaus santaClaus = new SantaClaus(personList);
        santaClaus.getThroughChimneys();
        System.out.println(santaClaus);
    }
}
