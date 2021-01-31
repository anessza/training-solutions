package week11d02;
/*
A futár minden fuvar után feljegyzi, hogy a hét hányadik napján
történt a fuvar. Ezután azt, hogy az adott nap hányadik fuvarját
teljesítette és ezután azt, hogy hány kilométer volt az adott fuvar.
A futár egy-egy fuvarját reprezentálja a Ride nevű osztály,
adatagokkal, konstruktorra, getterekkel.
 */

public class Ride {
    int day;
    int ride;
    int distance;

    public Ride(int day, int ride, int distance) {
        this.day = day;
        this.ride = ride;
        this.distance = distance;
    }

    public int getDay() {
        return day;
    }

    public int getRide() {
        return ride;
    }

    public int getDistance() {
        return distance;
    }
}
