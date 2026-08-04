import java.util.Scanner;

// 1. Encapsulation: private data + public getters/setters

class Account {
    private String name;
    private double balance;

    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() { return name; }
    public double getBalance() { return balance; }

    public void deposit(double amt) {
        if (amt > 0) balance += amt;
        else System.out.println("Invalid amount");
    }
}

public class P01_Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // not closed: System.in is shared
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter balance: ");
        double bal = sc.nextDouble();

        Account a = new Account(name, bal);
        // a.balance = 999;  // not allowed, balance is private
        a.deposit(500);

        System.out.println("Name: " + a.getName());
        System.out.println("Balance: " + a.getBalance());
    }
}
