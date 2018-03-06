package Practice.Algorithms.Implementation.CountingValleys;

import java.util.Scanner;

public class Solution {

    private static int countingValleys(int n, String s) {
        int count = 0;
        int h = 0;
        boolean valley = false;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'D':
                    h--;
                    if (h == -1) count++;
                    break;
                case 'U':
                    h++;
                    break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }

}
