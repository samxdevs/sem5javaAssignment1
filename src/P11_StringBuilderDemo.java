import java.util.Scanner;

// 11. StringBuilder for efficient string operations

public class P11_StringBuilderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        StringBuilder sb = new StringBuilder(word);
        System.out.println("Original : " + sb);

        sb.append(" Language");
        System.out.println("append   : " + sb);

        sb.insert(0, ">> ");
        System.out.println("insert   : " + sb);

        sb.reverse();
        System.out.println("reverse  : " + sb);

        sb.reverse();
        sb.replace(0, 3, "** ");
        System.out.println("replace  : " + sb);

        sb.delete(0, 3);
        System.out.println("delete   : " + sb);
        System.out.println("length   : " + sb.length());

        // Speed comparison: String vs StringBuilder
        long t1 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 50000; i++) s += i;      // creates a new object each time
        long t2 = System.currentTimeMillis();

        StringBuilder b = new StringBuilder();
        for (int i = 0; i < 50000; i++) b.append(i); // modifies the same object
        long t3 = System.currentTimeMillis();

        System.out.println("\nString concat took        : " + (t2 - t1) + " ms");
        System.out.println("StringBuilder append took : " + (t3 - t2) + " ms");
    }
}
