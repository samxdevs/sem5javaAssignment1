import java.util.Scanner;

// 16. Factorial of a number using recursion

public class P16_FactorialRecursion {
    static long fact(int n) {
        if (n <= 1) return 1;            // base case
        return n * fact(n - 1);          // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) System.out.println("Factorial is not defined for negative numbers");
        else       System.out.println(n + "! = " + fact(n));
    }
}
