package Practice.Algorithms.Implementation.FindDigits;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    private static int findDigits(int n) {
        int result = 0;
        int[] n1 = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        for (int d : n1) {
            if (d != 0 && n % d == 0) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }

}
