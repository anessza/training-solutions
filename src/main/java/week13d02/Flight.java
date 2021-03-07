package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightNumber;
    private DepartArrive D_A;
    private String city;
    private String flightDailyTime;

    public Flight(String flightNumber, DepartArrive d_A, String city, String flightDailyTime) {
        this.flightNumber = flightNumber;
        D_A = d_A;
        this.city = city;
        this.flightDailyTime = flightDailyTime;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setD_A(DepartArrive d_A) {
        D_A = d_A;
    }

    public void setFlightDailyTime(String flightDailyTime) {
        this.flightDailyTime = flightDailyTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public DepartArrive getD_A() {
        return D_A;
    }

    public String getFlightDailyTime() {
        return flightDailyTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "\nFlight {" +
                "flightNumber='" + flightNumber + '\'' +
                ", D_A=" + D_A +
                ", city='" + city + '\'' +
                ", flightDailyTime='" + flightDailyTime + '\'' +
                "}";
    }
}

