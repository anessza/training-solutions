package exam03retake01;

import java.io.IOException;

/*
Írj egy CdvCheck.check() metódust (paraméterezése, visszatérési értéke kiderül a tesztesetből),
mely kap egy adószámot, és eldönti róla, hogy helyes-e! A következőképp kell eldönteni. Fogni
kell az első kilenc számjegyet, és megszorozni rendre 1, 2, ..., 9 számmal. Az eredményt kell
összegezni, majd maradékos osztani 11-el. A 10. számjegynek meg kell egyeznie ezzel a számmal
(maradékkal).

Pl.:

8365670003
1 * 8 + 2 * 3 + 3 * 6 + ... + 9 * 0 = 124
124 maradékos osztás 11-el = 3
3 (maradék) == 3 (10. számhegy) - az adószám megfelelő

Ha a paraméterként átadott adószám nem 10 számjegy, vagy nem csak számjegy szerepel benne,
IllegalArgumentException kivételt kell dobni.
 */
public class CdvCheck {


    public boolean check(String cdv) {

        int i = 0;

        int check = 0;

        int ten = -1;

        for (char c : cdv.toCharArray()) {
            i++;
            int number = Integer.parseInt(String.valueOf(c));
            if (i < 10) {
                check = check + number * i;
            } else if (i == 10) {
                ten = number;
            }
        }

        int solve = check % 11;

        if (solve == ten) {
            return true;
        } else return false;
    }

    public boolean notNumber(String cdv){
        if (cdv.length() < 10) {
            throw new IllegalArgumentException("This CDV lenght is too sort");
        }
        try {
            int number = Integer.parseInt(cdv);
        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException("This CDV contains letter(s)", e);
        }
        return true;
    }
}
