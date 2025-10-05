// SlidingWindowFixed.java
// Find maximum sum of any subarray of size K

// Concept:
//   Maintain a running sum of window size K.
//   Add the new element, remove the element that falls out.
//   Avoid recomputing entire sums every time.

public class SlidingWindowFixed {
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Step 1: compute initial window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Step 2: slide the window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // add new, drop old
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Max sum of window size " + k + " = " + maxSumSubarray(arr, k));
        // Output: 9  (window [5,1,3])
    }
}