import java.util.Arrays;
import java.util.Scanner;

// 26. Reverse the elements of an array

public class P26_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println("Original : " + Arrays.toString(a));

        for (int i = 0, j = n - 1; i < j; i++, j--) {   // swap from both ends
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }

        System.out.println("Reversed : " + Arrays.toString(a));
    }
}
