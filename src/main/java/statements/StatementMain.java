package statements;

public class StatementMain {
    public static void main(String[] args) {
        int x=5+6;
        int y=11-x;
        int z=8;
        boolean b=true;
        boolean c=(b==true || z>5);
        z++;
        System.out.println("x: " + x + ", y: " + y + ", z: " + z + ", b: " + b + ", c: " + c);
    }
}
