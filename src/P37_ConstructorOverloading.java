import java.util.Scanner;

// 37. Constructor overloading: many constructors in one class

class Employee {
    String name;
    int id;
    double salary;

    Employee() {
        this("Not assigned", 0, 0);            // this(...) calls another constructor
    }

    Employee(String name) {
        this(name, 0, 0);
    }

    Employee(String name, int id) {
        this(name, id, 25000);
    }

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void show() {
        System.out.println("Name: " + name + ", Id: " + id + ", Salary: " + salary);
    }
}

public class P37_ConstructorOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String n = sc.nextLine();
        System.out.print("Enter employee id: ");
        int id = sc.nextInt();
        System.out.print("Enter salary: ");
        double sal = sc.nextDouble();

        new Employee().show();
        new Employee(n).show();
        new Employee(n, id).show();
        new Employee(n, id, sal).show();
    }
}
