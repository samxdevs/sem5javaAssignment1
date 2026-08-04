import java.util.Scanner;

// 2. Inheritance + Polymorphism

class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}

class Car extends Vehicle {
    void start() { System.out.println("Car starts with a key"); }
}

class Bike extends Vehicle {
    void start() { System.out.println("Bike starts with a kick"); }
}

public class P02_InheritancePolymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for Car, 2 for Bike: ");
        int ch = sc.nextInt();

        Vehicle v = (ch == 1) ? new Car() : new Bike();
        v.start();                 // decided at run time

        System.out.println("\nAll vehicles:");
        Vehicle[] list = { new Vehicle(), new Car(), new Bike() };
        for (Vehicle x : list) x.start();
    }
}
