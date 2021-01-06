package week08d01;

public class Point {

    int koordinataX;
    int koordinataY;

    public Point(int koordinataX, int koordinataY) {
        this.koordinataY = koordinataY;
        this.koordinataX=koordinataX;
    }

    public int getKoordinataX() {
        return koordinataX;
    }

    public int getKoordinataY() {
        return koordinataY;
    }

    public void setKoordinataX(int koordinataX) {
        this.koordinataX = koordinataX;
    }
    public void setKoordinataY(int koordinataY) {
        this.koordinataY = koordinataY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "koordinataX=" + koordinataX +
                ", koordinataY=" + koordinataY +
                '}';
    }

}
