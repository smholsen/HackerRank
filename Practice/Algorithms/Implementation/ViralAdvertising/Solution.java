package Practice.Algorithms.Implementation.ViralAdvertising;

import java.util.Scanner;

public class Solution {

    private static int viralAdvertising(int n) {
        int sum = 2;
        int pre = 2;
        for (int i = 1; i < n; i++) {
            pre = (int) Math.floor((3 * pre) / 2);
            sum += pre;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }

}
