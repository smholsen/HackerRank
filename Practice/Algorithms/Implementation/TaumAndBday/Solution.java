package Practice.Algorithms.Implementation.TaumAndBday;

import java.util.Scanner;

public class Solution {

    private static long taumBday(long b, long w, long x, long y, long z) {
        long bCost = Math.min(b * x, b * (y + z));
        long wCost = Math.min(w * y, w * (x + z));
        return bCost + wCost;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long result = taumBday(b, w, x, y, z);
            System.out.println(result);
        }
        in.close();
    }
}
