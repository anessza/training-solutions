package week09d03;
/*
A mai feladatban Mikulásnak segítünk ajándékokat kiosztani.
A week09d03 csomagba dolgozz. Készíts egy Present nevű enumot
a következő felsorolókkal: Toy, Electronic, Housekepping,
Decoration. Ezek fogják az ajándékok típusát reprezentálni.
Készíts egy Person osztályt legyen neki neve és életkora és
legyen egy Present típusú attribútuma. A nevet és életkort
konstruktorban kapja meg. Legyen egy setPresent() metódusa
ami beállítja az ajándék attribútumot véletlenszerűen, egy
kitétel van, 14 év fölötti nem kaphat játékot. Ennek
megvalósításához szabadon bővíthetőek az eddig elkészült elemek.
Legyen egy SantaClaus osztály, akinek van egy Person listája, amit
konstruktorban kap meg. Legyen neki egy getThroughChimneys() metódusa,
ami végigmegy az emberek listáján és meghívja minden ember setPresent()
metódusát.
 */

import java.util.Random;

public class Person {
    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPresent(){
        Random random=new Random();
        int value = random.nextInt(Present.values().length);
        if (age<14) {
            present = Present.values()[value];
        }
        else {
            value = random.nextInt(Present.values().length - 1)+1;
            present = Present.values()[value];
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", present=" + present +
                '}';
    }
}
