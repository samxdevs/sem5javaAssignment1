import java.util.Scanner;

// 4. Method overloading (same class) and overriding (child class)

class Calc {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
    double add(double a, double b) { return a + b; }

    void show() { System.out.println("Simple calculator"); }
}

class SciCalc extends Calc {
    void show() { System.out.println("Scientific calculator"); }   // overriding
}

public class P04_OverloadingOverriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        Calc c = new Calc();
        System.out.println("Overloading:");
        System.out.println("add(a,b)    = " + c.add(a, b));
        System.out.println("add(a,b,10) = " + c.add(a, b, 10));
        System.out.println("add(1.5,2.5)= " + c.add(1.5, 2.5));

        System.out.println("\nOverriding:");
        Calc ref = new Calc();
        ref.show();
        ref = new SciCalc();
        ref.show();
    }
}
