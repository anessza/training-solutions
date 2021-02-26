package exam03retake02;
/*
Balatoni viharjelzés

A https://vmonitor.rsoe.hu/api/mapApi/stations.php címen le lehet tölteni az aktuális balatoni viharjelzéseket.
Írj egy programot, mely kilistázza, hogy hol van vihar! Ábécésorrendbe rendezve!
A BalatonStorm osztály getStationsInStorm() metódusát implementáld! Paraméterként kap egy BufferedReader-t, és
visszaadja az állomások listáját. A fájl a következő formátumú.
[
  {
    "id": 5,
    "allomas": "Siófok (OMSZ)",
    "lat": "46.910647",
    "lng": "18.040237",
    "description": "A közforgalmú MAHART kikötőtől délnyugatra kb. 200 méterre",
    "level": 0,
    "groupId": "BE",
    "stationType": "LED"
  },
  {
    "id": 6,
    "allomas": "Siófok-H. Erzsébet",
    "lat": "46.91567",
    "lng": "18.06600000000003",
    "description": "Hotel Erzsébet szálló tetején.",
    "level": 0,
    "groupId": "BE",
    "stationType": "LED"
  }
]
Azokon az állomásokon van vihar, ahol a level értéke 3.
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.Collator;
import java.text.RuleBasedCollator;
import java.util.*;

public class BalatonStorm {
  public List<String> getStationsInStorm(BufferedReader reader)  {

      Path file = Path.of("storm.json");

      try (BufferedReader br = Files.newBufferedReader(file))
      {
          String line;
          String allomas = "";
          int level;

          List<String> vihar = new ArrayList<>();

          while ((line = br.readLine()) != null)
          {

              if (line.contains("\"allomas\":"))
              {
                  allomas = line.substring(16);
                  allomas= allomas.replace("\",", "");
              }

              if (line.contains("\"level\":"))
              {
                  String szint = line.substring(13, 14);
                  level = Integer.parseInt(szint);
                  if (level == 3)
                  {
                      vihar.add(allomas);
                      allomas = "";
                  }
              }
          }
          vihar = listaSorba(vihar);
          return vihar;
      }
       catch (IOException e) {
          throw new IllegalStateException("Can't read file", e);
      }
  }

  public List<String> listaSorba(List<String> stringList){
      List<String> listaSorba = new ArrayList<>(stringList);
      Collator collator = Collator.getInstance(new Locale("hu", "HU"));

      Collections.sort(listaSorba, collator);

      return listaSorba;
  }

    public static void main(String[] args) {
      BalatonStorm balatonStorm = new BalatonStorm();

        try (BufferedReader reader = new BufferedReader(new FileReader("storm.json")) ){
            System.out.println(balatonStorm.getStationsInStorm(reader));
        }
        catch (FileNotFoundException e) {
            throw new IllegalStateException("Can't find file", e);
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }
}
