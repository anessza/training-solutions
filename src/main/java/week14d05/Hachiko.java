package week14d05;
/*
A examples/week14d05/hachiko.srt van a Hachiko film felirata.
Írj egy countWords() metódust, mely paraméterül várja a fájlt,
varargsban szavakat. Megszámolja, hogy melyik szó hány sorban
szerepel a szövegben. Legyenek mondjuk a beadott szavak:
"Hachiko", "haza", "pályaudvar", "jó"
 */

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hachiko {

    public Map<String, Long> countWordsInFile(Path path, String[] words) {

        List<String> wordsInList = Arrays.asList(words);
        try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) {
            return stream
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .filter(wordsInList::contains)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            } catch (IOException e) {
            throw new IllegalStateException("Can't read the file!");
        }
    }

    public static void main(String[] args) {
        Hachiko hachiko = new Hachiko();
       Path path = Path.of("hachiko.srt");
        System.out.println(hachiko.countWordsInFile(path, new String[]{"Hachiko", "haza", "pályaudvar", "jó"}));
    }
}
