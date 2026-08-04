import java.util.Scanner;

// 29. 2D array: read and print its elements

public class P29_TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();

        int[][] m = new int[r][c];
        System.out.println("Enter " + (r * c) + " elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) m[i][j] = sc.nextInt();

        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) System.out.print(m[i][j] + "\t");
            System.out.println();
        }

        System.out.println("\nElement positions:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                System.out.println("m[" + i + "][" + j + "] = " + m[i][j]);
    }
}
