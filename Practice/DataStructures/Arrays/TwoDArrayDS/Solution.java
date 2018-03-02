package Practice.DataStructures.Arrays.TwoDArrayDS;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        int largestSum = Integer.MIN_VALUE;
        // First iterate over all rows starting from top untill I get till the third row from the bottom.
        for (int i = 0; i < arr.length - 2; i++) {
            // For each row iterate over all the top left numbers of an hourglass
            for (int j = 0; j < arr[0].length - 2; j++) {
                int sum = getHourglassSum(arr, i, j);
                largestSum = (sum > largestSum) ? sum : largestSum;
            }
        }
        System.out.print(largestSum);
    }

    private static int getHourglassSum(int[][] arr, int i, int j) {
        return arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
    }
}
