package Practice.Algorithms.Implementation.UtopianTree;

import java.util.Scanner;

public class Solution {

    private static int utopianTree(int n) {
        // https://oeis.org/A075427 O(1)
        return ((int) Math.pow(2, (n + 3) / 2)) + (((int) Math.pow(-1, n)) - 3) / 2;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }

}
