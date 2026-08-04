import java.util.Scanner;

// 14. if-else, switch and for loop

public class P14_ControlStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        // if-else
        if (marks >= 75)      System.out.println("Grade: Distinction");
        else if (marks >= 60) System.out.println("Grade: First class");
        else if (marks >= 35) System.out.println("Grade: Pass");
        else                  System.out.println("Grade: Fail");

        // switch
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6:
            case 7: System.out.println("Weekend"); break;
            default: System.out.println("Invalid day");
        }

        // for loop
        System.out.print("Enter a number for its table: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
