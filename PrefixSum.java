// PrefixSum.java
// Build prefix sum and answer range sum queries in O(1)
// Concept:
//   pre[i] = arr[1] + arr[2] + ... + arr[i]
//   sum(l, r) = pre[r] - pre[l-1]
//   Time Complexity: O(n) build, O(1) per query

import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 4, 5, 1}; // 1‑based; arr[0] is dummy
        int n = arr.length - 1;

        int[] pre = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1] + arr[i]; // build cumulative sum
        }

        // Example queries
        int l = 2, r = 4; // positions 2 to 4 → 2 + 4 + 5 = 11
        int sum = pre[r] - pre[l - 1];
        System.out.println("Sum(" + l + "," + r + ") = " + sum);
    }
}