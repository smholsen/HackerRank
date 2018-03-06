package Practice.Algorithms.Implementation.SockMerchant;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    private static int sockMerchant(int n, int[] ar) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for (int i : ar) {
            if (set.contains(i)) {
                result++;
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

}
