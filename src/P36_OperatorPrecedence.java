// 36. Operator precedence in Java

public class P36_OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;

        System.out.println("a = 10, b = 5, c = 2\n");

        System.out.println("a + b * c       = " + (a + b * c) + "   (* before +)");
        System.out.println("(a + b) * c     = " + ((a + b) * c) + "   (brackets first)");
        System.out.println("a - b + c       = " + (a - b + c) + "   (left to right)");
        System.out.println("a / b * c       = " + (a / b * c) + "   (left to right)");
        System.out.println("a > b && b > c  = " + (a > b && b > c) + "   (relational before &&)");
        System.out.println("a + b > c * 3   = " + (a + b > c * 3) + "   (arithmetic before >)");

        int x = 5;
        System.out.println("\nx = 5");
        System.out.println("x++ + ++x       = " + (x++ + ++x) + "   (5 + 7)");

        System.out.println("\nPrecedence order (high to low):");
        System.out.println("()  ->  ++ -- !  ->  * / %  ->  + -  ->  << >>");
        System.out.println("->  < > <= >=  ->  == !=  ->  &  ->  ^  ->  |  ->  &&  ->  ||  ->  ?:  ->  =");
    }
}
