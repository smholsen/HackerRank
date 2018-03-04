package Practice.Algorithms.Implementation.ExtraLongFactorials;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    static void extraLongFactorials(int n) {
        BigInteger bigint = BigInteger.valueOf(n);
        for (int i = n - 1; i > 0; i--) {
            bigint = bigint.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bigint);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}
