package Practice.Algorithms.Implementation.BirthdayChocolate;

import java.util.Scanner;

public class Solution {

    private static int solve(int n, int[] s, int d, int m) {
        int sum = 0;
        int r = 0;
        for (int i = 0; i < s.length; i++) {
            sum += s[i];
            // M is never less than 1
            if (i > m - 1) sum -= s[i - m];
            if (i >= m - 1 && sum == d) r++;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }

}
