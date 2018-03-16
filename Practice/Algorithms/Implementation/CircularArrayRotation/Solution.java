package Practice.Algorithms.Implementation.CircularArrayRotation;

import java.util.Scanner;

public class Solution {

    private static int[] circularArrayRotation(int[] a, int k) {
        // This question was weirdly and inaccurately formulated.
        // This method rotates the array k times, I think this is the point.
        k = k % a.length;
        if (k == 0) return a;
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int index = i - k;
            result[i] = (index < 0) ? a[a.length + index] : a[index];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] m = new int[q];
        for (int m_i = 0; m_i < q; m_i++) {
            m[m_i] = in.nextInt();
        }
        // This originally passed m, but I changed it to k, as the question did not make sense otherwise.
        int[] result = circularArrayRotation(a, k);
        for (int i = 0; i < m.length; i++) {
            System.out.print(result[m[i]] + (i != m.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}