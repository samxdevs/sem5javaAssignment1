import java.util.Scanner;

// 49. String is immutable, StringBuilder is mutable

public class P49_StringImmutabilityDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("\nString (immutable):");
        System.out.println("before   : " + s + "  hash: " + System.identityHashCode(s));
        s = s + " Java";                    // creates a NEW object
        System.out.println("after    : " + s + "  hash: " + System.identityHashCode(s));

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("\nStringBuilder (mutable):");
        System.out.println("before   : " + sb + "  hash: " + System.identityHashCode(sb));
        sb.append(" Java");                 // SAME object is modified
        System.out.println("after    : " + sb + "  hash: " + System.identityHashCode(sb));

        System.out.println("\nThe String hash changed (new object).");
        System.out.println("The StringBuilder hash stayed the same (same object).");
    }
}
