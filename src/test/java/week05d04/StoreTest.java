package week05d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week05d04.Store.getNumberOfExpired;


public class StoreTest {
    @Test
    void testStore() {

        Product test1 = new Product("alma", 2020, 12, 26);
        Product test2 = new Product("körte", 2020, 12, 31);
        Product test3 = new Product("banán", 2020, 11, 20);

        List<Product> testList = new ArrayList<>();
        testList.add(test1);
        testList.add(test2);
        testList.add(test3);

        int solved = getNumberOfExpired(testList);
        assertEquals(1, solved);
    }
}
