import java.util.Scanner;

// 39. Initialise class fields using a parameterized constructor

class Laptop {
    String brand;
    int ram;
    double price;

    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " | " + ram + " GB RAM | Rs." + price);
    }
}

public class P39_ParameterizedConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brand: ");
        String brand = sc.next();
        System.out.print("Enter RAM (GB): ");
        int ram = sc.nextInt();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Laptop l1 = new Laptop(brand, ram, price);
        Laptop l2 = new Laptop("Dell", 8, 55000);

        l1.display();
        l2.display();
    }
}
