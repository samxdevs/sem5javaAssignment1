import java.util.Scanner;

// 47. Reverse a string without using built-in reverse methods

public class P47_ReverseStringManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] ch = s.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) rev += ch[i];

        System.out.println("Original : " + s);
        System.out.println("Reversed : " + rev);
    }
}
