package introdate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Születési ideje (yyyy.mm.dd. formátumban): ");
        String dateOfBirthString= sc.nextLine();
        System.out.println("Neve: ");
        String name= sc.nextLine();

        String year= dateOfBirthString.substring(0, 4);
        String month= dateOfBirthString.substring(5, 7);
        String day= dateOfBirthString.substring(8, 10);

        Employee employee = new Employee(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day), name);
        System.out.println("A munkavállaló neve: " + employee.getName());
        System.out.println("A születési ideje: " + employee.getDateOfBirth());
        System.out.println("A belépés ideje: " + employee.getBeginEmployment());
    }

}
