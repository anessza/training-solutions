package week14d03;
import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class ClassNotebook {
    private List<Student> students = new ArrayList<>();

    public void addStudent(String student) {
        students.add(new Student(student));
    }

    public void addMark(String student, String subject, int mark) {
        for (Student oneStudent : students) {
            if (oneStudent.getName().equals(student)) {
                oneStudent.addMark(subject, mark);
                return;
            }
        }
        throw new IllegalArgumentException("Can't find student: " + student);
    }

    public List<Student> sortNotebook() {
//        List<Student> result = new ArrayList<>(students);
//        result.sort(Comparator.comparing(Student::getName, Collator.getInstance(new Locale("hu", "HU"))));
//        return result;

        return students
                .stream()
                .map(Student::new)
                .sorted(Comparator.comparing(Student::getName, Collator.getInstance(new Locale("hu", "HU"))))
                .collect(Collectors.toList());
    }

}