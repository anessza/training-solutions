package week07d04;

/*
Hozz létre egy week07d04.Lab nevű osztályt, ami azt tárolja el, hogy melyik
feladattal készültél el. Három attribútuma: title ami a tananyag neve, egy
completed, hogy elkészültél-e vele, és a completedAt , ami azt tárolja, hogy
mikor. Legyen két konstruktora! Az egyik csak a címet várja, ekkor úgy állítsa
be a példányt, hogy még nem készültél el. Legyen egy másik, ami várja a címet
és a dátumot. Ekkor azt állítsa be, hogy elvégezted a gyakorlati feladatot.
Írj egy complete metódust, ami kap egy dátumot, és beállítja, hogy elvégezted a
gyakorlati feladatot. Legyen egy complete metódusa, ami semmit nem vár, ez azt
állítja be, hogy MOST végezted el a gyakorlati feladatot. Írd meg a toString
metódusát is!
 */

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lab {
    private String title;
    boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
        this.completed=false;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        this.completed= true;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setCompletedAt(LocalDate completedAt) {
        this.completedAt = completedAt;
    }

    public void complete(LocalDate completeAt){
        setCompletedAt(completeAt);
        setCompleted(true);
    }

    public void complete(){
        setCompleted(true);
        setCompletedAt(LocalDate.now());
    }

    @Override
    public String toString() {
        return "Lab{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt +
                '}';
    }

    public static void main(String[] args) {
        Lab numberList=new Lab("NumberList");
        numberList.complete(LocalDate.now());
        Lab lab=new Lab("Lab");
        lab.complete();
        Lab Vehicle=new Lab("Vehicle");

        System.out.println(numberList.toString());
        System.out.println(lab.toString());
        System.out.println(Vehicle.toString());
    }
}
