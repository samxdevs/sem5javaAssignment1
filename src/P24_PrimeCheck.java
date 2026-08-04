import java.util.Scanner;

// 24. Check whether a number is prime (for loop version)

public class P24_PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean prime = n > 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) { prime = false; break; }
        }

        System.out.println(n + " is " + (prime ? "prime" : "not prime"));
    }
}
