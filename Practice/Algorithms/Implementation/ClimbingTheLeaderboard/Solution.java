package Practice.Algorithms.Implementation.ClimbingTheLeaderboard;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    private static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] rankings = new int[scores.length];
        int minScore = Integer.MAX_VALUE;
        int rank = 0;
        for (int si = 0; si < scores.length; si++) {
            if (scores[si] < minScore) {
                minScore = scores[si];
                rank++;
            }
            rankings[si] = rank;
        }
        rank++;
        int[] aliceRanks = new int[alice.length];
        Arrays.fill(aliceRanks, rankings[rankings.length - 1] + 1);
        for (int i = 0, j = scores.length - 1; i < alice.length; i++) {
            for (; j > -1; j--) {
                if (scores[j] > alice[i]) break;
                rank = rankings[j];
            }
            aliceRanks[i] = rank;
        }
        return aliceRanks;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i = 0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i = 0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        int[] result = climbingLeaderboard(scores, alice);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }

}
