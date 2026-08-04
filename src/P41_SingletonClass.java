// 41. Singleton class: only one object can ever be created

class Singleton {
    private static Singleton instance;    // the single object
    private int value;

    private Singleton() {                 // private constructor: no 'new' outside
        System.out.println("Singleton object created (only once)");
    }

    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }

    public void setValue(int v) { value = v; }
    public int getValue() { return value; }
}

public class P41_SingletonClass {
    public static void main(String[] args) {
        // Singleton s = new Singleton();   // error: constructor is private

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.setValue(50);

        System.out.println("s1 value = " + s1.getValue());
        System.out.println("s2 value = " + s2.getValue() + " (same object)");
        System.out.println("s1 == s2 : " + (s1 == s2));
    }
}
