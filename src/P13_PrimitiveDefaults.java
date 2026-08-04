// 13. All primitive data types and their default values

public class P13_PrimitiveDefaults {
    // instance variables get default values automatically
    static byte    b;
    static short   s;
    static int     i;
    static long    l;
    static float   f;
    static double  d;
    static char    c;
    static boolean bool;

    public static void main(String[] args) {
        System.out.println("Type     Size      Default");
        System.out.println("byte     1 byte    " + b);
        System.out.println("short    2 bytes   " + s);
        System.out.println("int      4 bytes   " + i);
        System.out.println("long     8 bytes   " + l);
        System.out.println("float    4 bytes   " + f);
        System.out.println("double   8 bytes   " + d);
        System.out.println("char     2 bytes   [" + c + "] (\\u0000)");
        System.out.println("boolean  1 bit     " + bool);

        System.out.println("\nRanges:");
        System.out.println("byte  : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int   : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long  : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
    }
}
