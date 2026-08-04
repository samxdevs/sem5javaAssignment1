import java.util.Scanner;

// 17. Check valid and invalid Java identifiers

public class P17_ValidIdentifiers {
    static String[] KEYWORDS = { "int", "for", "class", "new", "if", "else",
                                 "while", "public", "static", "void", "return" };

    static boolean isValid(String s) {
        if (s.isEmpty()) return false;
        if (!Character.isLetter(s.charAt(0)) && s.charAt(0) != '_' && s.charAt(0) != '$')
            return false;                                  // must not start with a digit
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_' && c != '$') return false;
        }
        for (String k : KEYWORDS)
            if (s.equals(k)) return false;                 // keywords are not allowed
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] samples = { "name", "_count", "$price", "2ndValue", "my name", "class", "total_1" };
        System.out.println("Sample identifiers:");
        for (String s : samples)
            System.out.println("  " + s + " -> " + (isValid(s) ? "Valid" : "Invalid"));

        System.out.print("\nEnter an identifier to check: ");
        String in = sc.nextLine();
        System.out.println(in + " -> " + (isValid(in) ? "Valid" : "Invalid"));
    }
}
