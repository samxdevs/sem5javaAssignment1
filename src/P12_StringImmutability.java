import java.util.Scanner;

// 12. String objects are immutable

public class P12_StringImmutability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();

        String s2 = s1;
        s1.concat(" World");             // result thrown away, s1 unchanged
        System.out.println("After concat, s1 = " + s1);

        s1 = s1.concat(" World");        // a NEW object is created
        System.out.println("New object s1   = " + s1);
        System.out.println("Old object s2   = " + s2);

        String a = "Java";
        String b = "Java";               // same object from the string pool
        System.out.println("\na == b (pool)          : " + (a == b));

        String c = new String("Java");   // new object in heap
        System.out.println("a == c (new object)    : " + (a == c));
        System.out.println("a.equals(c) (contents) : " + a.equals(c));

        System.out.println("\nupperCase gives a new string: " + a.toUpperCase());
        System.out.println("original is still         : " + a);
    }
}
