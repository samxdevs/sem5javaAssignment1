import java.util.Scanner;

// 34. Ternary operator:  condition ? valueIfTrue : valueIfFalse

public class P34_TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        int max = (a > b) ? a : b;
        System.out.println("Larger number : " + max);

        System.out.println("a is " + ((a % 2 == 0) ? "even" : "odd"));

        System.out.print("Enter marks: ");
        int m = sc.nextInt();
        String result = (m >= 35) ? "Pass" : "Fail";
        System.out.println("Result: " + result);

        // nested ternary
        String grade = (m >= 75) ? "A" : (m >= 60) ? "B" : (m >= 35) ? "C" : "F";
        System.out.println("Grade : " + grade);
    }
}
