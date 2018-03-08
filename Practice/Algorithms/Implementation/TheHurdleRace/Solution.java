package Practice.Algorithms.Implementation.TheHurdleRace;

import java.util.Scanner;

public class Solution {

    private static int hurdleRace(int k, int[] height) {
        int r = 0;
        for (int h : height) {
            if (k <= h) {
                int diff = h - k;
                k += diff;
                r += diff;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for (int height_i = 0; height_i < n; height_i++) {
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }

}
