package exam03;

import java.time.LocalDate;
import java.util.List;

public class Cruise extends Boat {
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers;

    public Cruise(Boat boat, LocalDate sailing, double basicPrice, List<Passenger> passengers) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
        this.passengers = passengers;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public boolean bookPassenger(Passenger passenger) {
       if (passenger.getMaxPassengers() > passengers.size()) {
           return true;
       }
       else return false;
    }
    public double getPriceForPassenger(Passenger passenger) {
        if (passenger.getCruiseClass() == CruiseClass.LUXURY) {
            return (3 * passenger.getBasicPrice());
        }
        if (passenger.getCruiseClass() == CruiseClass.FIRST) {
            return (1.8 * passenger.getBasicPrice());
        }
        if (passenger.getCruiseClass() == CruiseClass.SECOND) {
            return (1 * passenger.getBasicPrice());
        }
    }
    findPassengerByName() {


    }
    getPassengerNamesOrdered() {

    }
    sumAllBookingsCharged() {

    }
    countPassengerByClass() {

    }
}
