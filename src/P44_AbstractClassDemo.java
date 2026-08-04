import java.util.Scanner;

// 44. Abstract class with methods overridden in subclasses

abstract class Figure {
    String name;

    Figure(String name) { this.name = name; }

    abstract double area();                 // no body: subclass must override

    void show() {                           // normal method in abstract class
        System.out.println(name + " area = " + area());
    }
}

class SquareFig extends Figure {
    double side;
    SquareFig(double side) { super("Square"); this.side = side; }
    double area() { return side * side; }
}

class CircleFig extends Figure {
    double r;
    CircleFig(double r) { super("Circle"); this.r = r; }
    double area() { return 3.14159 * r * r; }
}

public class P44_AbstractClassDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        // Figure f = new Figure("x");   // error: cannot create an abstract object

        Figure[] figs = { new SquareFig(side), new CircleFig(r) };
        for (Figure f : figs) f.show();
    }
}
