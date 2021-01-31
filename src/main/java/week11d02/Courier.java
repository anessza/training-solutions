package week11d02;
/*
A feladatban egy biciklis futár egy heti munkáját rögzítjük
és készítünk statissztikákat.

A futár minden fuvar után feljegyzi, hogy a hét hányadik napján
történt a fuvar. Ezután azt, hogy az adott nap hányadik fuvarját
teljesítette és ezután azt, hogy hány kilométer volt az adott fuvar.
A futár egy-egy fuvarját reprezentálja a Ride nevű osztály,
adatagokkal, konstruktorra, getterekkel.

Készítsd el a Courier osztályt. Ez fogja a futárt reprezentálni.
Legyen egy rides listája ami fuvarokat tárol. Legyen egy addRide
metódus, ami csak sorrendben enged hozzáadni elemeket a listához.
Figyeljünk viszont arra, hogy nem feltétlenül minden nap dolgozott
a futár, de ha már bekerült egy 3. napi fuvar, akkor ne kerülhessen
be egy 2. napi. És arra is figyelj, hogy a napon belül is sorrendben
kerüljenek be az adatok. Ha a paraméterül kapott Ride nem felel meg
a feltételeknek dobjunk IllegalArgumentException-t.

pl egy helyes listára: 1 1 12 1 2 11 2 1 10 4 1 19

Készíts egy metódust, ami visszad egy napot amikor a futár nem dolgozott.
Ha több ilyen nap is van akkor a korábbit!
 */

import java.util.ArrayList;
import java.util.List;

public class Courier {
        public static void addRide(List<Ride> rideList, Ride ride){
        if (ride==null) {
            throw new IllegalArgumentException("Invalid elemets");
        }
        if (rideList.size()<1) {
            if (ride.getRide() > 1){
                throw new IllegalArgumentException("Invalid data, not the first ride");
            }
            else {
                rideList.add(0, ride);
            }
        }
        else {
            if (rideList.get(rideList.size()-1).getDay() > ride.getDay()){
                throw new IllegalArgumentException("Invalid day");
            }
            if ((rideList.get(rideList.size()-1).getRide() > ride.getRide()) && (rideList.get(rideList.size()-1).getDay() == ride.getDay())){
                throw new IllegalArgumentException("Invalid ride number");
            }
            else {
                rideList.add(rideList.size(), ride);
            }
        }

    }

    public static int noWorkingDay(List<Ride> rideList){
        int workDay = 1;
        int noWorkDay = 0;
        for (Ride item : rideList){
            if (item.getDay() == 7) {
               break;
            }
            if (item.getDay() == (workDay + 1)) {
                workDay = item.getDay();
            }

            if (item.getDay() > (workDay + 1)) {
                noWorkDay = workDay + 1;
                break;
            }
        }
        return noWorkDay;
    }
    public static void main(String[] args) {
        Ride ride1 = new Ride(1,1, 12);
        Ride ride2 = new Ride (1, 2, 10);
        Ride ride3 = new Ride (2, 1, 15);
        Ride ride4 = new Ride (5, 1, 10);

        List<Ride> rideList = new ArrayList<>();
        addRide(rideList, ride1);
        addRide(rideList, ride2);
        addRide(rideList, ride3);
        addRide(rideList, ride4);

        int noWorkingDay = noWorkingDay(rideList);

        System.out.println(noWorkingDay);
    }
}

