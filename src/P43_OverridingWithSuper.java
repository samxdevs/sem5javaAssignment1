// 43. Method overriding and calling the parent method using super

class Base {
    void greet() { System.out.println("Hello from Base class"); }
    void info()  { System.out.println("Base: general information"); }
}

class Derived extends Base {
    @Override
    void greet() {
        super.greet();                       // call parent version first
        System.out.println("Hello from Derived class");
    }

    @Override
    void info() {
        System.out.println("Derived: specific information");
    }
}

public class P43_OverridingWithSuper {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.greet();

        System.out.println();
        d.info();

        Base b = new Base();
        b.info();
    }
}
