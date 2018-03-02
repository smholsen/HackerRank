package Practice.Algorithms.Warmup.Staircase;

import java.util.Scanner;

public class Solution {

    private static String getNStrings(int n, String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(s);
        }
        return result.toString();
    }

    private static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(getNStrings(n - i, " "));
            System.out.print(getNStrings(i, "#"));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
