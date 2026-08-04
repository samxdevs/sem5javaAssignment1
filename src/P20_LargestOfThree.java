import java.util.Scanner;

// 20. Find the largest of three numbers

public class P20_LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int largest;
        if (a >= b && a >= c)      largest = a;
        else if (b >= a && b >= c) largest = b;
        else                       largest = c;

        System.out.println("Largest = " + largest);
    }
}
