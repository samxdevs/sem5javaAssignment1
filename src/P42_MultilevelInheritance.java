// 42. Multilevel inheritance: Grandfather -> Father -> Son

class Grandfather {
    void property() { System.out.println("Grandfather: owns the house"); }
}

class Father extends Grandfather {
    void business() { System.out.println("Father: runs the business"); }
}

class Son extends Father {
    void job() { System.out.println("Son: works as a software engineer"); }
}

public class P42_MultilevelInheritance {
    public static void main(String[] args) {
        Son s = new Son();

        s.property();      // from Grandfather
        s.business();      // from Father
        s.job();           // own method

        System.out.println("\nSon is a Father      : " + (s instanceof Father));
        System.out.println("Son is a Grandfather : " + (s instanceof Grandfather));
    }
}
