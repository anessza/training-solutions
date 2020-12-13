package week06d05;

/*
Készíts egy Biscuit nevű osztályt, amelynek van két attribútuma: BiscuitType type és
int gramAmount. A BiscuitType legyen felsorolásos típus a három kedvenc kekszfajtáddal!
A Biscuit nevű osztálynak legyen egy static metódusa of néven, mely paraméterként egy
BiscuitType-ot, és egy int gramAmount-ot vár és visszaad egy új Biscuit objektumot
amelyet a megadott paraméterek alapján hoz létre. Bónusz feladat: konzolra írás esetén
a Biscuit jelenítse meg a type és a gramAmount mezőket!
 */
public class Biscuit {
    private final BiscuitType type;
    private final int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public BiscuitType getType() {
        return type;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public static Biscuit of(BiscuitType type, int gramAmount){
        return new Biscuit(type, gramAmount);
    }

    public static void main(String[] args) {
        System.out.println("A kedvenc kekszeim: ");
        for (BiscuitType item: BiscuitType.values()){
            Biscuit keksz= of(item, 100);
            System.out.println(keksz.getType() + " (" + keksz.getGramAmount() + " gr.)");
        }
    }
}
