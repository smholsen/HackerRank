package Practice.Algorithms.Warmup.DiagonalDifference;

import java.util.Scanner;

public class Solution {

    static int diagonalDifference(int[][] a) {
        int diagonalSumLTR = 0;
        int diagonalSumRTL = 0;
        for (int i = 0; i < a.length; i++) {
            diagonalSumLTR += a[i][i];
            diagonalSumRTL += a[i][(a.length - 1) - i];
        }
        return Math.abs(diagonalSumLTR - diagonalSumRTL);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
