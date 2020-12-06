package week06d03;
/*
A week06d03.WordEraser osztályban legyen egy eraseWord(String words, String word)
metódus, mely az első paraméter szöveget úgy változtatja meg, hogy a második
paraméter összes előforulását kitörli belőle. A words paraméterben a szavak
szóközzel vannak elválasztva. A metódus térjen vissza a törölni kívánt szavak
nélküli Stringgel. (Mellőzzük a replace és replaceAll használatát)
 */

public class WordEraser {
    static String eraseWord(String words, String word) {

        StringBuilder resolved = new StringBuilder();
        String[] arrayWords= words.split(" ");


        for (String item : arrayWords) {
            if (!item.equals(word)) {
                String element = item + " ";
                resolved.append(element);
            }
        }
        return resolved.toString();
    }

    public static void main(String[] args) {

        String words= "Az alma leesik a fáról.";
        String word= "alma";
        System.out.println(eraseWord(words,word));

    }
}
