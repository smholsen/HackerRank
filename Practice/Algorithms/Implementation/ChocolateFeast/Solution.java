package Practice.Algorithms.Implementation.ChocolateFeast;

import java.util.Scanner;

public class Solution {

    private static int chocolateFeast(int n, int c, int m) {
        int wrappers = 0;
        int sum = (int) Math.floor(n / c);
        wrappers += sum;
        while (wrappers >= m) {
            int trade = (int) Math.floor(wrappers / m);
            wrappers -= (trade * m) - trade;
            sum += trade;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int result = chocolateFeast(n, c, m);
            System.out.println(result);
        }
        in.close();
    }
}