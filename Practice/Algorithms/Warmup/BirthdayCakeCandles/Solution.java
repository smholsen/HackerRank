package Practice.Algorithms.Warmup.BirthdayCakeCandles;

import java.util.Scanner;

public class Solution {

    private static int birthdayCakeCandles(int n, int[] ar) {
        int max = Integer.MIN_VALUE;
        int numCandles = 0;
        for (int c : ar) {
            if (c > max) {
                max = c;
                numCandles = 1;
            } else if (c == max) numCandles++;
        }
        return numCandles;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

}
