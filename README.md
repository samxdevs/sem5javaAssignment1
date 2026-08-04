# Java Assignment 1 — 51 Programs

Each program is a separate file in [src/](src/), named `Pnn_Topic.java` where `nn` is the
question number from the assignment.

## How to run

```sh
./run.sh          # compiles everything and opens the menu
./run.sh 15       # runs only program 15
```

In the menu type a program number (1–51), `99` to run all of them in sequence,
or `0` to exit.

Run a single file without the menu:

```sh
javac -d out src/*.java
java -cp out P19_OddEven

# or directly from source (Java 11+)
java src/P19_OddEven.java
```

Type input line by line when a program asks for it.

## Program list

| # | File | Topic |
|---|------|-------|
| 1 | [P01_Encapsulation.java](src/P01_Encapsulation.java) | Encapsulation |
| 2 | [P02_InheritancePolymorphism.java](src/P02_InheritancePolymorphism.java) | Inheritance + polymorphism |
| 3 | [P03_AbstractionInterface.java](src/P03_AbstractionInterface.java) | Abstraction with interfaces |
| 4 | [P04_OverloadingOverriding.java](src/P04_OverloadingOverriding.java) | Overloading vs overriding |
| 5 | [P05_AnimalHierarchy.java](src/P05_AnimalHierarchy.java) | Animal class hierarchy |
| 6 | [P06_MultipleInheritance.java](src/P06_MultipleInheritance.java) | Multiple inheritance via interfaces |
| 7 | [P07_ThisSuperKeywords.java](src/P07_ThisSuperKeywords.java) | `this` and `super` |
| 8 | [P08_Constructors.java](src/P08_Constructors.java) | Constructors |
| 9 | [P09_AccessModifiers.java](src/P09_AccessModifiers.java) | Access modifiers |
| 10 | [P10_FinalKeyword.java](src/P10_FinalKeyword.java) | `final` variable/method/class |
| 11 | [P11_StringBuilderDemo.java](src/P11_StringBuilderDemo.java) | StringBuilder |
| 12 | [P12_StringImmutability.java](src/P12_StringImmutability.java) | String immutability |
| 13 | [P13_PrimitiveDefaults.java](src/P13_PrimitiveDefaults.java) | Primitive types + default values |
| 14 | [P14_ControlStatements.java](src/P14_ControlStatements.java) | if-else, switch, for |
| 15 | [P15_PrimeWhileLoop.java](src/P15_PrimeWhileLoop.java) | Prime check (while loop) |
| 16 | [P16_FactorialRecursion.java](src/P16_FactorialRecursion.java) | Factorial (recursion) |
| 17 | [P17_ValidIdentifiers.java](src/P17_ValidIdentifiers.java) | Valid/invalid identifiers |
| 18 | [P18_LargestSmallestArray.java](src/P18_LargestSmallestArray.java) | Largest & smallest in array |
| 19 | [P19_OddEven.java](src/P19_OddEven.java) | Odd or even |
| 20 | [P20_LargestOfThree.java](src/P20_LargestOfThree.java) | Largest of three numbers |
| 21 | [P21_FactorialRecursion2.java](src/P21_FactorialRecursion2.java) | Factorial (recursion trace) |
| 22 | [P22_PalindromeCheck.java](src/P22_PalindromeCheck.java) | Palindrome (string/number) |
| 23 | [P23_FibonacciSeries.java](src/P23_FibonacciSeries.java) | Fibonacci series |
| 24 | [P24_PrimeCheck.java](src/P24_PrimeCheck.java) | Prime check (for loop) |
| 25 | [P25_ArraySum.java](src/P25_ArraySum.java) | Sum of array elements |
| 26 | [P26_ReverseArray.java](src/P26_ReverseArray.java) | Reverse an array |
| 27 | [P27_MatrixOperations.java](src/P27_MatrixOperations.java) | Matrix addition & multiplication |
| 28 | [P28_BubbleSort.java](src/P28_BubbleSort.java) | Bubble sort |
| 29 | [P29_TwoDArray.java](src/P29_TwoDArray.java) | 2D array |
| 30 | [P30_BinarySearch.java](src/P30_BinarySearch.java) | Binary search |
| 31 | [P31_RemoveDuplicates.java](src/P31_RemoveDuplicates.java) | Remove duplicates |
| 32 | [P32_ArithmeticRelationalLogical.java](src/P32_ArithmeticRelationalLogical.java) | Arithmetic/relational/logical operators |
| 33 | [P33_EqualsVsDoubleEquals.java](src/P33_EqualsVsDoubleEquals.java) | `==` vs `equals()` |
| 34 | [P34_TernaryOperator.java](src/P34_TernaryOperator.java) | Ternary operator |
| 35 | [P35_BitwiseOperators.java](src/P35_BitwiseOperators.java) | Bitwise operators |
| 36 | [P36_OperatorPrecedence.java](src/P36_OperatorPrecedence.java) | Operator precedence |
| 37 | [P37_ConstructorOverloading.java](src/P37_ConstructorOverloading.java) | Constructor overloading |
| 38 | [P38_CopyConstructor.java](src/P38_CopyConstructor.java) | Copy constructor |
| 39 | [P39_ParameterizedConstructor.java](src/P39_ParameterizedConstructor.java) | Parameterized constructor |
| 40 | [P40_StaticNonStatic.java](src/P40_StaticNonStatic.java) | Static vs non-static |
| 41 | [P41_SingletonClass.java](src/P41_SingletonClass.java) | Singleton class |
| 42 | [P42_MultilevelInheritance.java](src/P42_MultilevelInheritance.java) | Multilevel inheritance |
| 43 | [P43_OverridingWithSuper.java](src/P43_OverridingWithSuper.java) | Overriding + `super` |
| 44 | [P44_AbstractClassDemo.java](src/P44_AbstractClassDemo.java) | Abstract class |
| 45 | [P45_FinalClassesMethods.java](src/P45_FinalClassesMethods.java) | Final classes & methods |
| 46 | [P46_DynamicMethodDispatch.java](src/P46_DynamicMethodDispatch.java) | Dynamic method dispatch |
| 47 | [P47_ReverseStringManual.java](src/P47_ReverseStringManual.java) | Reverse a string manually |
| 48 | [P48_CharacterFrequency.java](src/P48_CharacterFrequency.java) | Character frequency |
| 49 | [P49_StringImmutabilityDemo.java](src/P49_StringImmutabilityDemo.java) | String vs StringBuilder |
| 50 | [P50_StringPalindrome.java](src/P50_StringPalindrome.java) | String palindrome |
| 51 | [P51_SplitStringWords.java](src/P51_SplitStringWords.java) | Split a sentence into words |

## Note about `Scanner`

The `Scanner` objects are deliberately not closed. Closing a `Scanner` also closes
`System.in`, which would stop the next program in the sequence from reading input.
The IDE's "resource leak" warning can be ignored here.
