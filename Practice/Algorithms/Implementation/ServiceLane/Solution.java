package Practice.Algorithms.Implementation.ServiceLane;

import java.util.Scanner;

public class Solution {

    private static int[] serviceLane(int[] width, int[][] cases) {
        int[] result = new int[cases.length];
        for (int i = 0; i < cases.length; i++) {
            int start = cases[i][0];
            int end = cases[i][1];
            int min = Integer.MAX_VALUE;
            for (int j = start; j <= end; j++) {
                min = (width[j] < min) ? width[j] : min;
            }
            result[i] = min;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] width = new int[n];
        for (int width_i = 0; width_i < n; width_i++) {
            width[width_i] = in.nextInt();
        }
        int[][] cases = new int[t][2];
        for (int cases_i = 0; cases_i < t; cases_i++) {
            for (int cases_j = 0; cases_j < 2; cases_j++) {
                cases[cases_i][cases_j] = in.nextInt();
            }
        }
        int[] result = serviceLane(width, cases);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}