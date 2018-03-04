package Practice.Algorithms.Warmup.MiniMaxSum;

import java.util.Scanner;

public class Solution {

    private static void miniMaxSum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }
        System.out.print((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
