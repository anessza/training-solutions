package week08d03;
/*
Készíts week08d03 csomagban egy StringLists osztályt és benne egy
stringListsUnion(List<String> first, List<String> second) metódust,
mely két string listát vár paraméterül és visszaadja az uniójukat.
Az úniónak minden elemet tartalmaznia kell mindkét listából, de egy
elem nem szerepelhet kétszer!
 */

import java.util.ArrayList;
import java.util.List;

public class StringLists {
    static List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> unionList = new ArrayList<>(first);

        for (String s : second) {
            if (!unionList.contains(s)) unionList.add(s);
        }

        return unionList;
    }

    public static void main(String[] args) {
        List<String> first = new ArrayList<String>();
        List<String> second = new ArrayList<String>();
        first.add("alma");
        first.add("körte");
        first.add("dinnye");
        second.add("répa");
        second.add("banán");
        second.add("körte");
        second.add("dió");
        second.add("alma");
        List<String> unionList = stringListsUnion(first, second);
        System.out.println(unionList);

    }
}


