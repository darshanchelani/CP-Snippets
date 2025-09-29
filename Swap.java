// Swap.java
// Demonstrates different ways to swap two numbers in Java


public class Swap {

    // 1. Swap using a temporary variable (recommended in most cases)
    public static void swapWithTemp() {
        int a = 5, b = 7;
        System.out.println("Before: a = " + a + ", b = " + b);

        int temp = a; // store a in temp
        a = b;        // assign b to a
        b = temp;     // put original a into b

        System.out.println("After (temp): a = " + a + ", b = " + b);
    }

    // 2. Swap using arithmetic (without temp, careful with overflow)
    public static void swapWithArithmetic() {
        int a = 5, b = 7;
        System.out.println("Before: a = " + a + ", b = " + b);

        a = a + b;   // sum of values
        b = a - b;   // (a+b) - b = original a
        a = a - b;   // (a+b) - a = original b

        System.out.println("After (arithmetic): a = " + a + ", b = " + b);
    }

    // 3. Swap using XOR (bitwise trick, no temp/overflow)
    public static void swapWithXOR() {
        int a = 5, b = 7;
        System.out.println("Before: a = " + a + ", b = " + b);

        a = a ^ b;   // XOR a and b, store in a
        b = a ^ b;   // (a^b) ^ b = original a
        a = a ^ b;   // (a^b) ^ a(original) = original b

        System.out.println("After (XOR): a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        swapWithTemp();
        swapWithArithmetic();
        swapWithXOR();
    }
}