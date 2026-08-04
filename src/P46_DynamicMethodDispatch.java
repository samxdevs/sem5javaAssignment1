import java.util.Scanner;

// 46. Run-time polymorphism using dynamic method dispatch

class Payment {
    void pay(double amt) { System.out.println("Paying " + amt + " by default method"); }
}

class CardPayment extends Payment {
    void pay(double amt) { System.out.println("Paying " + amt + " by credit card"); }
}

class UpiPayment extends Payment {
    void pay(double amt) { System.out.println("Paying " + amt + " by UPI"); }
}

class CashPayment extends Payment {
    void pay(double amt) { System.out.println("Paying " + amt + " by cash"); }
}

public class P46_DynamicMethodDispatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        System.out.print("Choose mode (1=Card, 2=UPI, 3=Cash): ");
        int ch = sc.nextInt();

        Payment p;                        // parent reference
        if (ch == 1)      p = new CardPayment();
        else if (ch == 2) p = new UpiPayment();
        else              p = new CashPayment();

        p.pay(amt);                       // method chosen at RUN TIME

        System.out.println("\nAll modes:");
        Payment[] all = { new CardPayment(), new UpiPayment(), new CashPayment() };
        for (Payment x : all) x.pay(amt);
    }
}
