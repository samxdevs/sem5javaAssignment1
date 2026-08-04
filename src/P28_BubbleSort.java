import java.util.Arrays;
import java.util.Scanner;

// 28. Sort an array using bubble sort

public class P28_BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println("Before sorting: " + Arrays.toString(a));

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {          // swap if out of order
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            System.out.println("Pass " + (i + 1) + "        : " + Arrays.toString(a));
        }

        System.out.println("After sorting : " + Arrays.toString(a));
    }
}
