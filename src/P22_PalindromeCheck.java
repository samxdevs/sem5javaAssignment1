import java.util.Scanner;

// 22. Check whether a string or a number is a palindrome

public class P22_PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string or a number: ");
        String s = sc.nextLine().trim().toLowerCase();

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i);

        if (s.equals(rev)) System.out.println(s + " is a palindrome");
        else               System.out.println(s + " is not a palindrome");

        System.out.println("Reversed: " + rev);
    }
}
