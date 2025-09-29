// GCD.java
// Implementation of Greatest Common Divisor (GCD) using the Euclidean Algorithm

// Concept:
//   gcd(a, b) is the largest integer that divides both a and b
//   Euclidean Algorithm repeatedly applies:
//       gcd(a, b) = gcd(b, a % b)
//   until b becomes 0. At that point, a is the GCD.

public class GCD {

    /**
     * Computes GCD of two integers using iterative Euclidean algorithm.
     * Uses Math.abs() so result is always non-negative even if inputs are negative.
     *
     * @param a first integer
     * @param b second integer
     * @return gcd of |a| and |b|
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;   // store remainder
            a = temp;    // swap
        }
        return Math.abs(a);
    }

    /**
     * Overloaded version for long integers.
     */
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    /**
     * Computes Least Common Multiple (LCM) using gcd:
     *   lcm(a, b) = |a / gcd(a, b) * b|
     * Be cautious of overflow in multiplication.
     */
    public static long lcm(long a, long b) {
        return Math.abs(a / gcd(a, b) * b);
    }

    // Example usage
    public static void main(String[] args) {
        int x = 48, y = 18;
        System.out.println("gcd(" + x + ", " + y + ") = " + gcd(x, y)); // 6

        long p = 270L, q = 192L;
        System.out.println("gcd(" + p + ", " + q + ") = " + gcd(p, q)); // 6

        long a = 21, b = 6;
        System.out.println("lcm(" + a + ", " + b + ") = " + lcm(a, b)); // 42
    }
}