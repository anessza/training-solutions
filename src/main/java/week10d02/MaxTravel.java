package week10d02;
/*
Van egy egész számok listája, amelyben egy szám azt jelzi, hogy az adott
számú buszmegállóban egy ember fel akar szállni. A 12,12,0,3,4,4 sorozat
tehát azt jelenti, hogy a 12-es buszmegállóban 2-en, a 0-ásban 1 ember,
3-asban egy ember, 4-esben 2 ember akar felszállni. A MaxTravel osztály
getMaxIndex() metódusa adja vissza, hogy hanyas megállóban szeretnének a
legtöbben felszálln! Maximum 30 megálló lehet.
Leegyszerűsítve a feladat az, hogy a paraméterként átadott tömbben keresse
meg, hogy melyik szám szerepel a legtöbbször.
 */

public class MaxTravel {
    public static int getMaxIndex(int[] busStationList){
        int previous = 0;
        int maxIndex = 0;
        int max = 0;
        int localMax = 0;
        int index = 0;

        for (int item : busStationList) {
            if (localMax > max) {
                max = localMax;
                maxIndex = index;
            }
            if (previous == item) {
                localMax++;
                previous = item;
            }
            else {
                localMax = 1;
                index = item;
                previous = item;
            }
        }
        return maxIndex;

    }

    public static void main(String[] args) {
        int[] busStationList = new int[] { 1, 1, 3 , 3, 3, 4};
        int maxTravelers = getMaxIndex(busStationList);
        System.out.println(maxTravelers);
    }
}
