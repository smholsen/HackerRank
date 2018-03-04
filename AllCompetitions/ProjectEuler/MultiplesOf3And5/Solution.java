package AllCompetitions.ProjectEuler.MultiplesOf3And5;

import java.util.Scanner;

public class Solution {

    private static void printSumOfMultiples(int n) {
        // Use the summation formula to compute this in constant time.
        // That's pretty cool.
        // Since we want strictly below we use n = n-1
        long n1 = n - 1;
        long sum = 0;
        long sum3 = 3 * (((n1 / 3) * ((n1 / 3 + 1))) / 2);
        long sum5 = 5 * (((n1 / 5) * ((n1 / 5 + 1))) / 2);
        // We must subtract 1x the doubles.
        long sum15 = 15 * (((n1 / 15) * ((n1 / 15 + 1))) / 2);
        sum = sum3 + sum5 - sum15;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            printSumOfMultiples(n);
        }
    }

}
