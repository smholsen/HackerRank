package Practice.Algorithms.Implementation.JumpingOnTheCloudsRevisited;

import java.util.Scanner;

public class Solution {

    private static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int pos = 0;
        while (true) {
            pos = (pos + k) % c.length;
            energy -= (c[pos] == 0) ? 1 : 3;
            if (energy < 0 || pos == 0) break;
        }
        return energy;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        in.close();
    }

}
