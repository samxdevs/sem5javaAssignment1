import java.util.Scanner;

// 15. Check whether a number is prime using a while loop

public class P15_PrimeWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean prime = n > 1;
        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
            i++;
        }

        System.out.println(n + " is " + (prime ? "a prime number" : "not a prime number"));
    }
}
