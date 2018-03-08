package Practice.Algorithms.Implementation.BeautifulDaysAtTheMovies;

import java.util.Scanner;

public class Solution {

    private static int beautifulDays(int i, int j, int k) {
        int result = 0;
        for (int d = i; d <= j; d++) {
            if (Math.abs((d) - reversed(d)) % k == 0) result++;
        }
        return result;
    }

    private static int reversed(int n) {
        return (Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString()));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }

}
