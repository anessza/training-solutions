/*package exam03;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Cruise extends Boat {
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers;

    public Cruise() {
        super();
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }


    public boolean bookPassenger(Passenger passenger) {
       if (passenger.getMaxPassengers() > passengers.size()) {
           return true;
       }
       else return false;
    }
    public double getPriceForPassenger(Passenger passenger) {
        double price =0;
        if (passenger.getCruiseClass() == CruiseClass.LUXURY) {
            price = (3 * passenger.getBasicPrice());
        }
        if (passenger.getCruiseClass() == CruiseClass.FIRST) {
            price =  (1.8 * passenger.getBasicPrice());
        }
        if (passenger.getCruiseClass() == CruiseClass.SECOND) {
            price =  (1 * passenger.getBasicPrice());
        }
        return price;
    }


    public Passenger findPassengerByName(String name) {




            }


    public List<String> getPassengerNamesOrdered() {

    }
    public double sumAllBookingsCharged() {


    }
    public Map<CruiseClass, Integer> countPassengerByClass() {

    }
}


 */