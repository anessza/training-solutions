package week11d03;
/*
Készíts egy WordFilter osztályt, melyben van egy
List<String> wordsWithChar(List<String> words, char c) metódus.
A metódus kiválógatja a paraméterül kapott String listából azokat
a szavakat, melyekben előfordul a c karakter, majd ezeket
visszaadja egy listában.
 */

import java.util.ArrayList;
import java.util.List;

public class WordFilter {
    static List<String> wordsWithChar(List<String> words, char c) {

        List<String> resultWordsList = new ArrayList<>();

        String s  = String.valueOf(c);

        if (words == null) {
            throw new IllegalArgumentException("Empty input List");
        }
        else {
            for (String item : words)
            {
                if (item.contains(s)) {
                    resultWordsList.add(item);
                }
            }

        }

        if (resultWordsList == null)
        {
            throw new IllegalArgumentException("no result words");
        }

        else {
            return resultWordsList;
        }
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("alma");
        words.add("körte");
        words.add("barack");
        words.add("dinnye");
        words.add("eper");
        words.add("kalap");
        char c = 'a';
        List<String> results = wordsWithChar(words, c);
        System.out.println(results);
    }
}
