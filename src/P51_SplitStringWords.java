import java.util.Scanner;

// 51. Split a sentence into words and print each word on a new line

public class P51_SplitStringWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        String[] words = s.trim().split("\\s+");

        System.out.println("\nWords:");
        for (int i = 0; i < words.length; i++)
            System.out.println((i + 1) + ". " + words[i]);

        System.out.println("\nTotal words = " + words.length);
    }
}
