import java.util.*;

class Solution {
    public static int[] nextPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: Find the break point
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }

        // If no break point → last permutation
        if (ind == -1) {
            reverse(arr, 0, n - 1);
            return arr;
        }

        // Step 2: Find the next greater element (from right side)
        for (int i = n - 1; i > ind; i--) {
            if (arr[i] > arr[ind]) {
                swap(arr, i, ind);
                break;
            }
        }

        // Step 3: Reverse the suffix
        reverse(arr, ind + 1, n - 1);

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
