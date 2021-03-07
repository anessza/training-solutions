package week13d03;



import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


/*
Adott a következő szerkezetű fájl, beosztas.txt:

Albatrosz Aladin
biologia
9.a
2
Albatrosz Aladin
osztalyfonoki
9.a
1
Csincsilla Csilla
matematika
9.b
2

A fájl tantárgyfelosztást tartalmaz. A tanttárgyfelosztást 4-es blokkokban adjuk meg.
Első sor a tanár neve, majd a tantárgy, majd az osztály ahol tanítja és végül az,
hogy heti hány órában. Írj egy metódust,ami paraméterül várja egy tanár nevét, és
kiírja, hogy hány órája van egy héten.
A fájl megtalálható a examples\week13d03\src\main\resources\beosztas.txt
 */
public class Schedule {
    private String teacherName;
    private String subject;
    private String schoolClass;
    private int weeklyHour;

    public Schedule(String teacherName, String subject, String schoolClass, int weeklyHour) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.schoolClass = schoolClass;
        this.weeklyHour = weeklyHour;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    public int getWeeklyHour() {
        return weeklyHour;
    }

    public void setWeeklyHour(int weeklyHour) {
        this.weeklyHour = weeklyHour;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "teacherName='" + teacherName + '\'' +
                ", subject='" + subject + '\'' +
                ", schoolClass='" + schoolClass + '\'' +
                ", weeklyHour=" + weeklyHour +
                '}';
    }

    public static List<Schedule> readFromFile(String file) {
        List<Schedule> scheduleList = new ArrayList<>();
        Path filePath = Path.of(file);

        try {
            BufferedReader reader = Files.newBufferedReader(filePath);
            String line;
            String teacherName = null;
            String subject = null;
            String schoolClass = null;
            int weeklyHour = 0;
            int i=0;
            while ((line = reader.readLine()) != null) {
                i++;
                if ((i == 1) || (((i - 1) % 4) == 0)) teacherName = line;
                if ((i == 2) || (((i - 2) % 4) == 0)) subject = line;
                if ((i == 3) || (((i - 3) % 4) == 0)) schoolClass = line;
                if ((i == 4) || (((i - 4) % 4) == 0)) {
                    weeklyHour = Integer.parseInt(line);
                    Schedule schedule = new Schedule(teacherName, subject, schoolClass, weeklyHour);
                    scheduleList.add(schedule);
                }
            }

            System.out.println(scheduleList.get(0));
            return scheduleList;
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }

    public static int weeklyHourByTeacherName(String teacherName) {
        List<Schedule> scheduleList = readFromFile("beosztas.txt");
        int weeklyHourByTeacher = 0;
        for (Schedule item : scheduleList){
            if (item.teacherName.equals(teacherName)){
                weeklyHourByTeacher = weeklyHourByTeacher + item.weeklyHour;
            }
        }
        return weeklyHourByTeacher;
    }

    public static void main(String[] args) {
        System.out.println(weeklyHourByTeacherName("Albatrosz Aladin"));
    }
}
