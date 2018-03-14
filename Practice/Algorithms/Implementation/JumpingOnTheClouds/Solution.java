package Practice.Algorithms.Implementation.JumpingOnTheClouds;

import java.util.Scanner;

public class Solution {

    private static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for (int i = 0; i < c.length; i++) {
            if (c.length - i == 1) return jumps;
            if (c.length - i <= 2) return jumps + 1;
            if (c[i + 2] != 1) {
                i++;
            }
            jumps++;
        }
        return jumps;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }
}
