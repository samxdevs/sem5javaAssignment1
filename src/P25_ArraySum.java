import java.util.Scanner;

// 25. Sum of all elements of an array

public class P25_ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int sum = 0;
        for (int x : a) sum += x;

        System.out.println("Sum     = " + sum);
        System.out.println("Average = " + (double) sum / n);
    }
}
