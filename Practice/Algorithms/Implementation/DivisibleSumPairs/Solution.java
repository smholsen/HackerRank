package Practice.Algorithms.Implementation.DivisibleSumPairs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static int divisibleSumPairs(int n, int k, int[] ar) {
        // We can solve this in O(n) by first creating a map of the unique numbers based on their % k.
        // Then we can iterate over the array and count the numbers that adds to a  n % k == 0.
        Map<Integer, Integer> modKCounts = new HashMap<>();
        int result = 0;
        // Build the modulo map
        for (int num : ar) {
            int key = num % k;
            int inverse = (key == 0) ? 0 : k - (num % k);
            if (modKCounts.containsKey(inverse)) {
                result += modKCounts.get(inverse);
            }
            modKCounts.merge(key, 1, (a, b) -> a + b);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }

}
