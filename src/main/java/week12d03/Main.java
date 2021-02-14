package week12d03;

public class Main {

    public static void main(String[] args) {
        NumberStat numberStat = new NumberStat();
        numberStat.readFromFile("numbers.txt");
        System.out.println(numberStat.getNumbers());
        System.out.println(numberStat.findSmallestUnique());
    }
}
