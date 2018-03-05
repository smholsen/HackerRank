package Practice.Algorithms.Implementation.BreakingTheRecords;

import java.util.Scanner;

public class Solution {

    private static int[] breakingRecords(int[] score) {
        int min = score[0];
        int max = score[0];
        int nMin = 0;
        int nMax = 0;
        for (int s : score) {
            if (s < min) {
                min = s;
                nMin++;
            }
            if (s > max) {
                max = s;
                nMax++;
            }
        }
        return new int[]{nMax, nMin};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for (int score_i = 0; score_i < n; score_i++) {
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        in.close();
    }

}
