import java.util.Scanner;

public class Point {
    Scanner scanner = new Scanner(System.in); // сканер для ввода координат точки, переделать на чтение из файла
    int x, y; // объявляем переменные координат точки

    // делаем конструктор точки
    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // создаём точку
    public Point createdPoint() {
        int x = (int) (scanner.nextInt()); //реализовать чтение из файла
        int y = (int) (scanner.nextInt()); //реализовать чтение из файла
        Point p = new Point(x, y);
        return p;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
// спер, разобраться что за исключение и зачем!!!
//    @Override
//    public String toString() {
//        return "(" + x + ";" + y + ")";
//    }
}



