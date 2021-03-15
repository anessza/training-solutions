/*package week14d03;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassNotebookTest {

    static ClassNotebook c = new ClassNotebook();

    @BeforeAll
    static void init() {
        c.addStudent("András");
        c.addStudent("Marci");
        c.addStudent("Kitti");
        c.addStudent("Andi");

        c.addMark("András","tesnevelés",5);
        c.addMark("András","matematika",4);
        c.addMark("András","fizika",4);
    }

    @Test
    void addMarkTest() {
        Exception exception = assertThrows(IllegalArgumentException.class,()->
                c.addMark(null,"fizika",4));
        assertEquals("Can't find student: null",exception.getMessage());
    }

    @Test
    void sortNotebookTest() {
        List<Student> s = c.sortNotebook();

        s.get(0).addMark("rajz",4);
        System.out.println(s);
        System.out.println(c.sortNotebook());
    }
}

 */