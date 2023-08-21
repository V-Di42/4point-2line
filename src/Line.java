public class Line {
    private Point a;
    private Point b;

    public Line() {
    }
    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }
    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    //    спер, разобраться с переопределением!!
    @Override
    public String toString() {
        return String.format("Линия с координатами " + a + " и " + b);
    }

}
