package Practice.Algorithms.Implementation.EqualizeTheArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static int equalizeArray(int[] arr) {
        // Solve in O(n) Time and O(n) space by counting frequencies.
        Map<Integer, Integer> map = new HashMap<>();
        int max = arr[0];
        for (int n : arr) {
            map.merge(n, 1, Integer::sum);
            max = (map.get(max) < map.get(n)) ? n : max;
        }
        return arr.length - map.get(max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }
}