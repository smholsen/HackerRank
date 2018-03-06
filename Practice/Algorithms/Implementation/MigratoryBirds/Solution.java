package Practice.Algorithms.Implementation.MigratoryBirds;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static int migratoryBirds(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        int t = -1;
        int max = 0;
        for (int i : ar) {
            int num = map.merge(i, 1, (a, b) -> a + b);
            if (num == max) t = Math.min(t, i);
            if (num > max) {
                t = i;
                max = num;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }

}
