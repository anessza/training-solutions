package week12d05;
/*
Töltsd le az index.hu nyitólapját böngészőből, ez egy html állomány!
Másold be a projektedbe (index.html) néven! Ez egy szöveges állomány.
Olvasd be, és számold meg, hány sorban szerepel a koronavírus szó!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Covid {

    public int wordCounter(String word, String path){
        Path url = Path.of(path);
        try (BufferedReader br = Files.newBufferedReader(url)) {
            String line;
            int counter = 0;
            while((line = br.readLine()) != null){
                if (line.toLowerCase().contains(word)){
                    counter++;
                }
            } return counter;
        }
        catch (IOException e){
            throw new IllegalStateException("Can't read file", e);
        }

    }

    public static void main(String[] args) {
        Covid covid = new Covid();
        System.out.println(covid.wordCounter("koronavírus", "index.html"));
    }
}
