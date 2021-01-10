package week10d01;
/*
Túrázás közben egy GPS eszköz rögzíti a pontokat. Eltárolja a GPS koordinátákat,
valamint a magasságot (mindegyik lebegőpontos érték). Írj a week10d01.Hiking
osztályba egy getPlusElevation() metódust, mely megkapja a magasságok listáját,
és visszaadja a emelkedések összegét. Azaz pl. 10,20,15,18 esetén 13, ugyanis
(20 - 10) + (18 - 15). A 20 méterről 15 méterre ereszkedést nem számolja bele,
hiszen az ereszkedés, és nem emelkedés.
 */

import java.util.ArrayList;
import java.util.List;

public class Hiking {
    public static float getPlusElevation(List<Float> high){
        float climb = 0;
        float previous = high.get(0);
        for (int i=1; i<high.size(); i++) {
            if (high.get(i)>previous) {
                climb = climb + (high.get(i)-previous);
                previous= high.get(i);
            }
            else {
                previous = high.get(i);
            }
        }
        return  climb;
    }

    public static void main(String[] args) {
        List<Float> highList = new ArrayList<>();
        highList.add((float) 15.0);
        highList.add((float) 20.0);
        highList.add((float) 35.0);
        highList.add((float) 35.0);
        highList.add((float) 30.0);
        highList.add((float) 15.0);
        highList.add((float) 20.4);
        float climb = getPlusElevation(highList);
        System.out.println(climb);

    }
}
