/**
 * Created by HSWook on 2017. 2. 20..
 */
public class Line {
    Point start;
    Point end;

    Line() {
        System.out.println("from empty");
    }

    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    Line(Line l) {
        this.start = l.start;
        this.end = l.end;
    }

    double length() {
        int a = this.end.x - this.start.x;
        int b = this.end.y - this.start.y;

        return Math.sqrt(a * a + b * b);
    }

    static double length(Line line) {
        Point start = line.start;
        Point end = line.end;

        int a = end.x - start.x;
        int b = end.y - start.y;

        return Math.sqrt(a * a + b * b);
    }
}
