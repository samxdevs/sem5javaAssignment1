import java.util.Scanner;

// 33. Difference between == and equals() for strings

public class P33_EqualsVsDoubleEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the same string again: ");
        String s2 = sc.nextLine();

        System.out.println("\ns1 == s2      : " + (s1 == s2) + "   (compares references)");
        System.out.println("s1.equals(s2) : " + s1.equals(s2) + "   (compares contents)");

        String a = "Hello";
        String b = "Hello";              // string pool -> same object
        String c = new String("Hello");  // heap -> different object

        System.out.println("\na == b        : " + (a == b));
        System.out.println("a == c        : " + (a == c));
        System.out.println("a.equals(c)   : " + a.equals(c));
    }
}
