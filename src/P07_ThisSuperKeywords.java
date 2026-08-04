import java.util.Scanner;

// 7. 'this' refers to current object, 'super' refers to parent class

class Person {
    String name;
    Person(String name) {
        this.name = name;              // this.name = field, name = parameter
    }
    void show() { System.out.println("Person: " + name); }
}

class Student extends Person {
    int roll;
    Student(String name, int roll) {
        super(name);                   // parent constructor
        this.roll = roll;
    }
    void show() {
        super.show();                  // parent method
        System.out.println("Roll no: " + this.roll);
    }
}

public class P07_ThisSuperKeywords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.print("Enter roll no: ");
        int r = sc.nextInt();

        new Student(n, r).show();
    }
}
