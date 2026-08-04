import java.util.Scanner;

// 32. Arithmetic, relational and logical operators

public class P32_ArithmeticRelationalLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("\nArithmetic operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational operators:");
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        System.out.println("\nLogical operators:");
        System.out.println("(a > 0) && (b > 0) = " + ((a > 0) && (b > 0)));
        System.out.println("(a > 0) || (b > 0) = " + ((a > 0) || (b > 0)));
        System.out.println("!(a > b)           = " + !(a > b));
    }
}
