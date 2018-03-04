package Practice.Algorithms.Implementation.Kangaroo;

import java.util.Scanner;

public class Solution {

    private static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        if (x1 < x2 && v1 <= v2) return "NO";
        if (x2 < x1 && v2 <= v1) return "NO";
        if ((x1 - x2) % (v2 - v1) == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }

}
