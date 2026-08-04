import java.util.Scanner;

// 8. Constructors: default, parameterized and constructor overloading

class Book {
    String title;
    double price;

    Book() {                                  // default constructor
        title = "Unknown";
        price = 0.0;
    }

    Book(String title) {                      // one argument
        this.title = title;
        this.price = 100;
    }

    Book(String title, double price) {        // two arguments
        this.title = title;
        this.price = price;
    }

    void show() { System.out.println(title + " -> Rs." + price); }
}

public class P08_Constructors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String t = sc.nextLine();
        System.out.print("Enter price: ");
        double p = sc.nextDouble();

        new Book().show();
        new Book(t).show();
        new Book(t, p).show();
    }
}
