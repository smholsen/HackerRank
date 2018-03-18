package Practice.Algorithms.Implementation.MinimumDistances;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static int minimumDistances(int[] a) {
        // Map holds the index of the closest similar element in a.
        Map<Integer, Integer> map = new HashMap<>();
        // Min denotes the current minimum distance
        int min = Integer.MAX_VALUE;
        boolean noneFound = true;
        for (int i = 0; i < a.length; i++) {
            if (map.keySet().contains(a[i]) && (i - map.get(a[i])) < min) {
                min = i - map.get(a[i]);
                noneFound = false;
            }
            map.put(a[i], i);
        }
        return (noneFound) ? -1 : min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int result = minimumDistances(a);
        System.out.println(result);
        in.close();
    }
}
