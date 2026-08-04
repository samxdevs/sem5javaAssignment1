// 9. Access modifiers: private, default, protected, public

class Sample {
    private   int a = 1;      // only inside Sample
    int       b = 2;          // default: same package
    protected int c = 3;      // same package + subclasses
    public    int d = 4;      // everywhere

    void showAll() {
        System.out.println("Inside Sample -> " + a + " " + b + " " + c + " " + d);
    }
}

class SubSample extends Sample {
    void showInherited() {
        // System.out.println(a);   // error: private not inherited
        System.out.println("Inside SubSample -> " + b + " " + c + " " + d);
    }
}

public class P09_AccessModifiers {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.showAll();
        new SubSample().showInherited();

        // System.out.println(s.a);  // error: a has private access
        System.out.println("From main -> " + s.b + " " + s.c + " " + s.d);

        System.out.println("\nprivate   : same class only");
        System.out.println("default   : same package");
        System.out.println("protected : same package + subclass");
        System.out.println("public    : anywhere");
    }
}
