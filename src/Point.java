import java.util.Scanner;

public class Point {
    private int x;
    private int y;

    // делаем конструктор точки

    public Point() {
    };

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;
    }
// конструкторы
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    // спер, разобраться с переопределением!!!
    @Override
    public String toString() {
        return String.format("Создали точку с координатами " + x + " и " + y);
    }
}



