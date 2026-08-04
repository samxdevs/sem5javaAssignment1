import java.util.Scanner;

// 50. Check if a string is a palindrome (two pointer method)

public class P50_StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase().replace(" ", "");

        boolean palindrome = true;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) { palindrome = false; break; }
            i++;
            j--;
        }

        System.out.println(palindrome ? "It is a palindrome" : "It is not a palindrome");
    }
}
