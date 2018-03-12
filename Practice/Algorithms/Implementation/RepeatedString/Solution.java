package Practice.Algorithms.Implementation.RepeatedString;

import java.util.Scanner;

public class Solution {

    private static long repeatedString(String s, long n) {
        int numInString = 0;
        long sum = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (s.charAt(i) == 'a') {
                numInString++;
                if (n % s.length() != 0 && i < n % s.length()) sum++;
            }
        }
        long numRepetitions = n / s.length();
        sum += numRepetitions * numInString;

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }

}
