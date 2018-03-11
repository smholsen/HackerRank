package Practice.Algorithms.Implementation.NonDivisibleSubset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static int nonDivisibleSubset(int k, int[] arr) {
        // Solves problem in O(n) time and O(k) space
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int k1 = 0; k1 < k; k1++) map.put(k1, 0);
        for (int a : arr) {
            map.merge(a % k, 1, Integer::sum);
        }
        // Take max one from mod 0.
        sum = (map.get(0) == 0) ? 0 : 1;
        for (int i = 1; i <= k/2; i++) {
            // Max one from mod half
            if (k % 2 == 0 && i == k/2) sum += (map.get(k/2) == 0) ? 0 : 1;
            else sum += Math.max(map.get(i), map.get(k - i));
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = nonDivisibleSubset(k, arr);
        System.out.println(result);
        in.close();
    }

}
