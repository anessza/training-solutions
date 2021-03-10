package week13d05;
/*
Írj egy metódust, amely megszámolja, hogy hány különböző betű van egy szóban.
A kis és nagybetűk közötti különbség nem számít! A space-eket, számjegyeket,
stb. ne vegye figyelembe! Csak az angol ábécé betűit!
 */

import java.util.HashSet;
import java.util.Set;

public class Letters {
    public static int summeryOfLettersInWord(String word) {
        if (word == null) return 0;

        String lowerCaseWord = word.toLowerCase();

        StringBuilder onlyLetters = new StringBuilder();

        for (int i = 0; i < lowerCaseWord.length(); i++) {
            if ((!(lowerCaseWord.charAt(i) == ' ')) && ((Character.getNumericValue(lowerCaseWord.charAt(i))) > 9)) {
                onlyLetters.append(lowerCaseWord.charAt(i));
            }
        }
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < onlyLetters.length(); i++) {
            if (onlyLetters.charAt(i) > '@' && onlyLetters.charAt(i) <= 'z') {
                characters.add(onlyLetters.charAt(i));
            }
        }
        return characters.size();
    }

    public static void main(String[] args) {
        System.out.println(summeryOfLettersInWord("Salamon123 2ma"));
    }
}
