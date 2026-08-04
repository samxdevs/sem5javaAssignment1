import java.util.Scanner;

// 31. Remove duplicate elements from an array

public class P31_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int[] unique = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < size; j++)
                if (unique[j] == a[i]) { found = true; break; }
            if (!found) unique[size++] = a[i];
        }

        System.out.print("After removing duplicates: ");
        for (int i = 0; i < size; i++) System.out.print(unique[i] + " ");
        System.out.println("\nUnique count = " + size);
    }
}
