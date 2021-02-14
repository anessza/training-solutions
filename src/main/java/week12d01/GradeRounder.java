package week12d01;

import java.util.Arrays;

/*
Készíts egy GradeRounder osztályt, amiben van egy
int[] grades roundGrades(int[] grades) metódus.
A grades tömb pontszámokat tartalmaz 0 és 100 között.
A feladat az, hogy kerekítsük a benne lévő számokat a
következő szabály szerint: Ha a pontszám és az 5 következő
többszöröse közötti különbség kisebb, mint 3, akkor
kerekítsük fel a számot az 5 következő többszörösére.
Fontos: a 40 pont alatti pontszámok elégtelenek, ezeket
egyáltalán nem kell kerekíteni. Példa: a pontszám 84. 85 - 84
kevesebb mint 3, így felfelé kerekítünk.
 */
public class GradeRounder {
    int[] roundGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 40) {
                int itemDiv5 = grades[i] / 5;
                int nextDiv5 = (itemDiv5 + 1) * 5;
                if ((nextDiv5 - grades[i]) < 3) {
                    grades[i] = nextDiv5;
                }
            }
        }
        return grades;
    }


    public static void main(String[] args) {
        int[] grades = new GradeRounder().roundGrades(new int[]{81, 84, 38, 49});
        System.out.println(Arrays.toString(grades));
    }
}