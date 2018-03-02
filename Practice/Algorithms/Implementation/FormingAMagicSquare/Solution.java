package Practice.Algorithms.Implementation.FormingAMagicSquare;

import java.util.Scanner;

public class Solution {

    static int formingMagicSquare(int[][] s) {
        int[][][] possibilities = {
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}}
        };
        int min = Integer.MAX_VALUE;
        for (int[][] possibility : possibilities) {
            int diff = 0;
            for (int i = 0; i < possibility.length; i++) {
                for (int j = 0; j < possibility[0].length; j++) {
                    diff += (Math.max(s[i][j], possibility[i][j]) - Math.min(s[i][j], possibility[i][j]));
                }
            }
            min = Math.min(min, diff);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for (int s_i = 0; s_i < 3; s_i++) {
            for (int s_j = 0; s_j < 3; s_j++) {
                s[s_i][s_j] = in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}
