package Practice.Algorithms.Implementation.FairRations;

import java.util.Scanner;

public class Solution {

    private static int fairRations(int[] B) {
        int sum = 0;
        for (int b : B) sum += b;
        if (sum % 2 == 1) return -1;
        sum = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] % 2 == 1) {
                B[i]++;
                B[i + 1]++;
                sum += 2;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] B = new int[N];
        for (int B_i = 0; B_i < N; B_i++) {
            B[B_i] = in.nextInt();
        }
        int result = fairRations(B);
        if (result > -1) {
            System.out.println(result);
        } else {
            System.out.println("NO");
        }
        in.close();
    }
}