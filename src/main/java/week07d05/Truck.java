package week07d05;

public class Truck extends Vehicle {
    @Override
    public TransmissionType getTransmissionType() {
        return TransmissionType.MANUAL;
    }

    public Truck(int gears, TransmissionType transmissionType) {
        super(gears, transmissionType);
    }
}
