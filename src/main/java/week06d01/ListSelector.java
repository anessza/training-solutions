package week06d01;

import java.util.ArrayList;
import java.util.List;

public class ListSelector {
    static List<String> listSelector(List<String> stringList) throws IllegalArgumentException {
        List<String> newStringList = new ArrayList<>();
        for (String item: stringList){
            int i = stringList.indexOf(item);
            if ((i % 2) == 0) {
                newStringList.add(item);
            }
        }
        return newStringList;
    }

    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("Alma");
        test.add("Jácint");
        test.add("Nárcisz");
        test.add("Anikó");
        test.add("András");
        test.add("Tamás");
        test.add("Andrea");
        List<String> newList= listSelector(test);
        for (String item: newList) {
            System.out.println(item);
        }
    }
}
