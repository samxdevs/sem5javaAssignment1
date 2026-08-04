import java.util.Scanner;

// 27. Matrix addition and multiplication (square matrices)

public class P27_MatrixOperations {
    static void print(String title, int[][] m) {
        System.out.println(title);
        for (int[] row : m) {
            for (int v : row) System.out.print(v + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size n (for n x n): ");
        int n = sc.nextInt();

        int[][] a = new int[n][n], b = new int[n][n];

        System.out.println("Enter " + (n * n) + " elements of matrix A:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

        System.out.println("Enter " + (n * n) + " elements of matrix B:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) b[i][j] = sc.nextInt();

        int[][] sum = new int[n][n], pro = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                sum[i][j] = a[i][j] + b[i][j];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    pro[i][j] += a[i][k] * b[k][j];

        print("\nMatrix A:", a);
        print("Matrix B:", b);
        print("A + B:", sum);
        print("A x B:", pro);
    }
}
