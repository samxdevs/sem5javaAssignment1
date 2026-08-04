import java.util.Scanner;

// 35. Bitwise operators: & | ^ ~ << >> >>>

public class P35_BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("\na = " + a + " -> " + Integer.toBinaryString(a));
        System.out.println("b = " + b + " -> " + Integer.toBinaryString(b));

        System.out.println("\na & b  = " + (a & b) + "   (AND)");
        System.out.println("a | b  = " + (a | b) + "   (OR)");
        System.out.println("a ^ b  = " + (a ^ b) + "   (XOR)");
        System.out.println("~a     = " + (~a) + "   (NOT)");
        System.out.println("a << 2 = " + (a << 2) + "   (left shift, x4)");
        System.out.println("a >> 2 = " + (a >> 2) + "   (right shift, /4)");
        System.out.println("a >>> 2= " + (a >>> 2) + "   (unsigned right shift)");
    }
}
