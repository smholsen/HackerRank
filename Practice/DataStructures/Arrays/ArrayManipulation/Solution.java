package Practice.DataStructures.Arrays.ArrayManipulation;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] list = new long[n];
        for (int a0 = 0; a0 < m; a0++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            list[a - 1] += k;
            if (b < n) list[b] -= k;
        }

        long sum = Integer.MIN_VALUE;
        long temp = 0;
        for (long number : list) {
            temp += number;
            sum = (temp > sum) ? temp : sum;
        }
        System.out.print(sum);
        in.close();
    }
}
