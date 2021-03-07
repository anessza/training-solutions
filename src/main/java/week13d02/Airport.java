package week13d02;
/*
Adott egy fájl melyben egy reptér egy napi munkáját rögzítettük. Adott egy járatszám,
az, hogy érkező vagy felszálló gépről van-e szó. A kiinduló/cél város, attól függöen
hogy indul vagy érkezik-e a gép és a felszállás/leszállás pontos ideje.

A fájl:

FC5354 Arrival Dublin 18:16
KH2442 Departure Berlin 15:54
ID4963 Departure Amsterdam 15:22
CX8486 Arrival Brussels 10:37
EJ9251 Departure  Toronto 11:30
KJ7245 Departure Bern 6:18
JN6048 Arrival Moscow 18:39
MN5047 Arrival Athens 9:35

Az időpontok szándékosan így szereplnek, nincsenek nullák a számok előtt. Az adatok össze
vissza szerepelnek a fájlban. Feladatok:
    Olvasd be a fájl tartalmát a memóriába.
    Határozd meg, hogy induló vagy érkező járatból volt-e több.
    Legyen egy metódus ami járatszám alapján ad vissza egy járatot.
    Írj egy metódust ami bekér egy várost és azt, hogy az induló
    vagy érkező járatokat szeretnénk-e. És egy Listába adjuk viassza az összes abba városba induló/érkező repülőt.
    Adjuk vissza a legkorábban induló repülőt!
    Fájl: examples\week13d02\src\main\resources\cities.txt
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static week13d02.DepartArrive.DEPARTURE;


public class Airport {

    public static LocalTime dailyTimeToTime(String dailyTime){
        int i = dailyTime.indexOf(":");
        int hour = Integer.parseInt(dailyTime.substring(0, i));
        int minute = Integer.parseInt(dailyTime.substring(i+1));
        LocalTime time = LocalTime.of(hour, minute);
        return time;
    }

    public static Flight lineBySpace(String line){
        int i = line.indexOf(" ");
        String flightNumber = line.substring(0, i);

        int j = line.indexOf(" ",i+1);
        String DA = line.substring(i+1, j);

        DepartArrive D_A;
        if (DA.charAt(0) == 'D')
        {
            D_A = DEPARTURE;
        }
        else
        {
            D_A = DepartArrive.ARRIVAL;
        }

        int k = line.indexOf(" ",j+1);
        String city = line.substring(j+1, k);

        String flightDailyTime = line.substring(k+1);

        Flight flight = new Flight(flightNumber, D_A, city, flightDailyTime);

        return flight;
    }

    public static List<Flight> readFromFile(String file) {
        List<Flight> AirpotFlightDailyList = new ArrayList<>();
        Path filePath = Path.of(file);

        try {
            BufferedReader reader = Files.newBufferedReader(filePath);
            String line;
            while ((line = reader.readLine()) != null) {
                Flight flight = lineBySpace(line);
                AirpotFlightDailyList.add(flight);
            }
            return AirpotFlightDailyList;
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }

    public static String moreOfDepartureOrArrival(List<Flight> flightList){
        int arrival = 0;
        int departure = 0;
        for(Flight item: flightList) {
            if (item.getD_A().equals(DepartArrive.ARRIVAL)) {
                arrival++;
            }
            if (item.getD_A().equals(DEPARTURE)) {
                departure++;
            }
        }
        String resolve;
        if (arrival>departure) {
           resolve = DepartArrive.ARRIVAL.toString();
           return resolve;
        }
        if (arrival<departure) {
            resolve = DEPARTURE.toString();
            return resolve;
        }
        else return "equal";
        }

        public static Flight flightByFlightNumber(List<Flight> flightList, String flightNumber) {
            Flight resolve = null;

            for (Flight item : flightList) {
                if (item.getFlightNumber().equals(flightNumber)) {
                    resolve = item;
                    break;
                }
            }
            return resolve;
        }

    public static List<Flight> flightByCityAndD_A(List<Flight> flightList, String city, DepartArrive D_A) {
        List<Flight> flightByCityAndD_A_List = new ArrayList<>();

        for (Flight item : flightList) {
            if (item.getCity().equals(city) && item.getD_A().equals(D_A)) {
                flightByCityAndD_A_List.add(item);
            }
        }
        return flightByCityAndD_A_List;
    }

    public static Flight earliestDepartureFlight(List<Flight> flightList) {
        LocalTime firstTime = LocalTime.of(23,59);
        String flightNumber = "";

        for (Flight item : flightList) {
            if (item.getD_A().equals(DEPARTURE)) {
                LocalTime time = dailyTimeToTime(item.getFlightDailyTime());
                if (time.isBefore(firstTime)) {
                    firstTime = time;
                    flightNumber = item.getFlightNumber();
                }
            }
        }
        Flight flight = flightByFlightNumber(flightList, flightNumber);
        return flight;
    }




    public static void main(String[] args) {
        Airport airport= new Airport();
        List<Flight> airportFlightList = readFromFile("cities.txt");
        System.out.println(airportFlightList.toString());
        System.out.println(moreOfDepartureOrArrival(airportFlightList));
        System.out.println(flightByFlightNumber(airportFlightList, "KJ7245"));
        System.out.println(flightByFlightNumber(airportFlightList, "AB7245"));
        System.out.println(flightByCityAndD_A(airportFlightList, "Toronto", DEPARTURE));
        System.out.println(earliestDepartureFlight(airportFlightList));
    }
}
