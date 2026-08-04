import java.util.Scanner;

// 5. Animal class hierarchy showing polymorphism

class Animal {
    String name;
    Animal(String name) { this.name = name; }
    void sound() { System.out.println(name + " makes a sound"); }
}

class Dog extends Animal {
    Dog(String n) { super(n); }
    void sound() { System.out.println(name + " says Woof"); }
}

class Cat extends Animal {
    Cat(String n) { super(n); }
    void sound() { System.out.println(name + " says Meow"); }
}

class Cow extends Animal {
    Cow(String n) { super(n); }
    void sound() { System.out.println(name + " says Moo"); }
}

public class P05_AnimalHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your dog's name: ");
        String n = sc.nextLine();

        Animal[] zoo = { new Dog(n), new Cat("Kitty"), new Cow("Gauri") };
        for (Animal a : zoo) a.sound();
    }
}
