// 40. Static vs non-static members

class Counter {
    static int objectCount = 0;      // shared by all objects
    int id;                          // separate copy for each object

    Counter() {
        objectCount++;
        id = objectCount;
    }

    static void showCount() {        // static method: called with class name
        System.out.println("Total objects created = " + objectCount);
        // System.out.println(id);   // error: cannot use instance field here
    }

    void showId() {                  // non-static: called with an object
        System.out.println("This object's id = " + id);
    }
}

public class P40_StaticNonStatic {
    public static void main(String[] args) {
        Counter.showCount();          // works without any object

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.showId();
        c2.showId();
        c3.showId();

        Counter.showCount();
        System.out.println("Static variable is shared: c1 sees " + c1.objectCount);
    }
}
