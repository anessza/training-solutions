package week07d05;

/*
Készíts a week07d05 csomagba egy Vehicle, egy Car, egy Truck és
egy Motorcycle osztályt. A Vehicle osztálynak legyen egy int
getNumberOfGears és egy TransmissionType getTransmissionType
metódusa. A fenti osztályok értelemszerűen öröklődjenek egymásból
és mindegyiknek implementálja a sebességek számát és a váltó típusát.
A lehetséges váltótípusok: MANUAL, AUTOMATIC, SEQUENTIAL. Az
alapértelmezett váltó típus (a Vehicle osztályban) MANUAL, de a Car
automatikus, míg a Motorcycle SEQUENTIAL. Az alapértelmezett sebesség
szám 5.
 */

public class Vehicle {
    int gears=5;
    TransmissionType transmissionType = TransmissionType.MANUAL;

    public Vehicle(int gears, TransmissionType transmissionType) {
        this.gears = gears;
        this.transmissionType = transmissionType;
    }

    public int getNumberOfGears() {
        return gears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public static void main(String[] args) {
        Car mustang = new Car(4, TransmissionType.AUTOMATIC);
        Motorcycle bike = new Motorcycle(1, TransmissionType.SEQUENTIAL);
        Truck truck = new Truck(2, TransmissionType.MANUAL);

        System.out.println("A mustang autó sebessége = " + mustang.getNumberOfGears());
        System.out.println("A mustang autó sebbességváltó típusa = " + mustang.getTransmissionType());
        System.out.println("A bike motorkerékpár sebessége = " + bike.getNumberOfGears());
        System.out.println("A bike motorkerékpár sebbességváltó típusa = " + bike.getTransmissionType());
        System.out.println("A truck teherautó sebessége = " + truck.getNumberOfGears());
        System.out.println("A truck teherautó sebbességváltó típusa = " + truck.getTransmissionType());
    }

}
