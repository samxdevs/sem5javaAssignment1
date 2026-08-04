// 45. Final classes and final methods

final class MathHelper {                  // cannot be extended
    static int square(int n) { return n * n; }
}

// class MyMath extends MathHelper { }    // error: cannot inherit from final class

class Payment45 {
    final void validate() {               // cannot be overridden
        System.out.println("Validating payment (fixed rule)");
    }

    void pay() { System.out.println("Paying by default method"); }
}

class CardPayment45 extends Payment45 {
    // void validate() { }                // error: overridden method is final
    @Override
    void pay() { System.out.println("Paying by credit card"); }
}

public class P45_FinalClassesMethods {
    public static void main(String[] args) {
        System.out.println("square(7) from final class = " + MathHelper.square(7));

        Payment45 p = new CardPayment45();
        p.validate();                     // inherited final method
        p.pay();                          // overridden method
    }
}
