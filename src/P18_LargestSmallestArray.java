import java.util.Scanner;

// 18. Find the largest and smallest number in an array

public class P18_LargestSmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int max = a[0], min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }

        System.out.println("Largest  = " + max);
        System.out.println("Smallest = " + min);
    }
}
