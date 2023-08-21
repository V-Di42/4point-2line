public class Line {
    Point a;
    Point b;

    public Line() {
    }
    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }


//    спер, разобраться с переопределением!!
    @Override
    public String toString() {
        return String.format("Линия с координатами " + a + " и " + b);
    }

}
