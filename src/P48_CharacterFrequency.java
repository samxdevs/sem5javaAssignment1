import java.util.Scanner;

// 48. Count the frequency of each character in a string

public class P48_CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] ch = s.toCharArray();
        boolean[] done = new boolean[ch.length];

        System.out.println("\nCharacter frequencies:");
        for (int i = 0; i < ch.length; i++) {
            if (done[i] || ch[i] == ' ') continue;

            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) { count++; done[j] = true; }
            }
            System.out.println("'" + ch[i] + "' -> " + count);
        }
    }
}
