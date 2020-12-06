package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week06d01.ListSelector.listSelector;

public class ListSelectorTest {
    @Test
    void testListSelector(){
        List<String> test = new ArrayList<>();
        test.add("Alma");
        test.add("Jácint");
        test.add("Nárcisz");
        test.add("Anikó");
        test.add("András");
        test.add("Tamás");
        test.add("Andrea");

        String testRight = "[AlmaNárciszAndrásAndrea]";
        String solved = listSelector(test);
        assertEquals   (testRight, solved );
    }
}
