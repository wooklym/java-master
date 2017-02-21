public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Point point1 = new Point(1, 2);

        Point point2 = new Point();
        point2.x = 10;
        point2.y = 7;

        Line line1 = new Line();
        line1.start = point1;
        line1.end = point2;
        Line line2 = new Line(point1, point2);
        Line line3 = new Line(line1);

        System.out.println(line1.length());
        System.out.println(Line.length(line1));
    }
}
