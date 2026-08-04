// 10. final variable, final method, final class

class ParentFinal {
    final int MAX = 100;                 // final variable: cannot be changed

    final void rule() {                  // final method: cannot be overridden
        System.out.println("This method cannot be overridden");
    }

    void normal() { System.out.println("Parent normal method"); }
}

class ChildFinal extends ParentFinal {
    // void rule() { }                   // error: cannot override final method
    void normal() { System.out.println("Child overrides normal method"); }
}

final class Config {                     // final class: cannot be extended
    static final String APP = "JavaAssignment";
}

// class MyConfig extends Config { }     // error: cannot inherit from final class

public class P10_FinalKeyword {
    public static void main(String[] args) {
        ParentFinal p = new ParentFinal();
        System.out.println("final variable MAX = " + p.MAX);
        // p.MAX = 200;                  // error: cannot assign to final variable

        p.rule();
        new ChildFinal().normal();

        System.out.println("final class constant = " + Config.APP);
    }
}
