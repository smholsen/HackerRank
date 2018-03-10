package Practice.Algorithms.Implementation.AngryProfessor;

import java.util.Scanner;

public class Solution {

    private static String angryProfessor(int k, int[] a) {
        int n = 0;
        for (int s : a) {
            if (s <= 0) n++;
            if (n >= k) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
            }
            String result = angryProfessor(k, a);
            System.out.println(result);
        }
        in.close();
    }

}
