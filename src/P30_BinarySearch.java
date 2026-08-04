import java.util.Arrays;
import java.util.Scanner;

// 30. Binary search on a sorted array

public class P30_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers (they will be sorted):");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int low = 0, high = n - 1, pos = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key)      { pos = mid; break; }
            else if (a[mid] < key)  low = mid + 1;
            else                    high = mid - 1;
        }

        if (pos == -1) System.out.println(key + " not found");
        else           System.out.println(key + " found at index " + pos);
    }
}
