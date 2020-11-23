package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 12, 06);
        String artist= "Télapó";
        LocalTime startTime=  LocalTime.of(18,00 );
        LocalTime endTime= LocalTime.of(19,00);

        Performance performance = new Performance(date, artist, startTime, endTime);

        System.out.println(performance.getInfo());
    }
}
