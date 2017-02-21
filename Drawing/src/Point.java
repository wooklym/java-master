/**
 * Created by HSWook on 2017. 2. 20..
 */
public class Point {
    int x;
    int y;

    Point() {
        System.out.println("Point is about to create");
    }

    Point(int x, int y) {
        System.out.println("Another Point is about to create");
        this.x = x;
        this.y = y;
    }
}
