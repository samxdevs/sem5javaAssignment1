import java.util.Scanner;

// 3. Abstraction using an interface

interface Shape {
    double area();          // only what to do, not how
}

class Circle implements Shape {
    double r;
    Circle(double r) { this.r = r; }
    public double area() { return 3.14159 * r * r; }
}

class Rect implements Shape {
    double l, b;
    Rect(double l, double b) { this.l = l; this.b = b; }
    public double area() { return l * b; }
}

public class P03_AbstractionInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble(), b = sc.nextDouble();

        Shape s1 = new Circle(r);
        Shape s2 = new Rect(l, b);

        System.out.println("Circle area = " + s1.area());
        System.out.println("Rect area   = " + s2.area());
    }
}
