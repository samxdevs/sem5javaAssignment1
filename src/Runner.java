import java.lang.reflect.Method;

// Menu to run any of the 51 programs, or all of them in sequence.

public class Runner {

    static String[] programs = {
        "P01_Encapsulation",              "P02_InheritancePolymorphism",
        "P03_AbstractionInterface",       "P04_OverloadingOverriding",
        "P05_AnimalHierarchy",            "P06_MultipleInheritance",
        "P07_ThisSuperKeywords",          "P08_Constructors",
        "P09_AccessModifiers",            "P10_FinalKeyword",
        "P11_StringBuilderDemo",          "P12_StringImmutability",
        "P13_PrimitiveDefaults",          "P14_ControlStatements",
        "P15_PrimeWhileLoop",             "P16_FactorialRecursion",
        "P17_ValidIdentifiers",           "P18_LargestSmallestArray",
        "P19_OddEven",                    "P20_LargestOfThree",
        "P21_FactorialRecursion2",        "P22_PalindromeCheck",
        "P23_FibonacciSeries",            "P24_PrimeCheck",
        "P25_ArraySum",                   "P26_ReverseArray",
        "P27_MatrixOperations",           "P28_BubbleSort",
        "P29_TwoDArray",                  "P30_BinarySearch",
        "P31_RemoveDuplicates",           "P32_ArithmeticRelationalLogical",
        "P33_EqualsVsDoubleEquals",       "P34_TernaryOperator",
        "P35_BitwiseOperators",           "P36_OperatorPrecedence",
        "P37_ConstructorOverloading",     "P38_CopyConstructor",
        "P39_ParameterizedConstructor",   "P40_StaticNonStatic",
        "P41_SingletonClass",             "P42_MultilevelInheritance",
        "P43_OverridingWithSuper",        "P44_AbstractClassDemo",
        "P45_FinalClassesMethods",        "P46_DynamicMethodDispatch",
        "P47_ReverseStringManual",        "P48_CharacterFrequency",
        "P49_StringImmutabilityDemo",     "P50_StringPalindrome",
        "P51_SplitStringWords"
    };

    static void run(int no) {
        String cls = programs[no - 1];
        System.out.println("\n---------- Program " + no + ": " + cls + " ----------");
        try {
            Method m = Class.forName(cls).getMethod("main", String[].class);
            m.invoke(null, (Object) new String[0]);
        } catch (Exception e) {
            System.out.println("Error running " + cls + ": " + e.getCause());
        }
        System.out.println("---------- end of program " + no + " ----------");
    }

    // Reads one line directly from System.in (no Scanner here, so that the
    // input meant for the selected program is left untouched in the stream).
    static String readLine() {
        StringBuilder sb = new StringBuilder();
        try {
            int c = System.in.read();
            if (c == -1) return "0";                 // no more input -> exit
            while (c != -1 && c != '\n') {
                sb.append((char) c);
                c = System.in.read();
            }
        } catch (Exception e) {
            return "0";
        }
        return sb.toString();
    }

    static void menu() {
        System.out.println("\n================ JAVA ASSIGNMENT 1 ================");
        for (int i = 0; i < programs.length; i++) {
            System.out.printf("%2d. %-32s", i + 1, programs[i].substring(4));
            if (i % 2 == 1) System.out.println();
        }
        System.out.println("\n\n 0. Exit          99. Run all in sequence");
    }

    public static void main(String[] args) {
        if (args.length > 0) {                  // e.g.  java Runner 15
            run(Integer.parseInt(args[0]));
            return;
        }

        while (true) {
            menu();
            System.out.print("Enter program number: ");
            int ch;
            try {
                ch = Integer.parseInt(readLine().trim());
            } catch (Exception e) {
                System.out.println("Please enter a number.");
                continue;
            }

            if (ch == 0) { System.out.println("Bye!"); return; }
            else if (ch == 99) { for (int i = 1; i <= programs.length; i++) run(i); }
            else if (ch >= 1 && ch <= programs.length) run(ch);
            else System.out.println("Invalid choice.");
        }
    }
}
