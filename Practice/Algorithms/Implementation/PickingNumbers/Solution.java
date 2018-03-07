package Practice.Algorithms.Implementation.PickingNumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static int pickingNumbers(int[] a) {
        int max = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            int x = map.merge(i, 1, (n, m) -> n + m);
            int y = 0;
            if (map.keySet().contains(i - 1)) y = map.get(i - 1);
            if (map.keySet().contains(i + 1)) y = Math.max(map.get(i + 1), y);
            x += y;
            max = (x > max) ? x : max;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }

}
