import java.util.Scanner;

// 21. Factorial using recursion (with the recursion steps shown)

public class P21_FactorialRecursion2 {
    static long factorial(int n) {
        System.out.println("  calling factorial(" + n + ")");
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Negative numbers have no factorial");
        } else {
            long result = factorial(n);
            System.out.println("Factorial of " + n + " = " + result);
        }
    }
}
