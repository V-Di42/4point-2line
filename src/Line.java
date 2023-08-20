public class Line {
    Point a, b;

    public Line() {

    }
    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public static Line createdLine(Point x1y1, Point x2y2) {
        return new Line(x1y1,x2y2);
    }

//    спер, разобраться что за исключение и зачем!!!
//    @Override
//    public String toString() {
//        return String.format(" a%s, b%s;", a, b);
//    }

}
