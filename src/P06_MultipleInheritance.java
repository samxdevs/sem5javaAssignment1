import java.util.Scanner;

// 6. Multiple inheritance using interfaces

interface Swimmer {
    void swim();
}

interface Flyer {
    void fly();
}

class Duck implements Swimmer, Flyer {
    String name;
    Duck(String name) { this.name = name; }
    public void swim() { System.out.println(name + " can swim"); }
    public void fly()  { System.out.println(name + " can fly"); }
}

public class P06_MultipleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter duck name: ");
        Duck d = new Duck(sc.nextLine());

        d.swim();
        d.fly();
        System.out.println("Is a Swimmer? " + (d instanceof Swimmer));
        System.out.println("Is a Flyer?   " + (d instanceof Flyer));
    }
}
