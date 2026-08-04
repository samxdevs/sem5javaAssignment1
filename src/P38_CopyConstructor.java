import java.util.Scanner;

// 38. Copy constructor: create a new object from an existing one

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {                 // copy constructor
        this.x = p.x;
        this.y = p.y;
    }

    void show() { System.out.println("(" + x + ", " + y + ")"); }
}

public class P38_CopyConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y: ");
        Point p1 = new Point(sc.nextInt(), sc.nextInt());

        Point p2 = new Point(p1);           // copy

        System.out.print("p1 = "); p1.show();
        System.out.print("p2 = "); p2.show();

        p2.x = 100;                          // p2 is a separate object
        System.out.println("\nAfter changing p2.x:");
        System.out.print("p1 = "); p1.show();
        System.out.print("p2 = "); p2.show();
    }
}
