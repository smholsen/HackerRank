package AllCompetitions.ProjectEuler.EvenFibonacciNumbers;

import java.util.Scanner;

public class Solution {

    private static long getEvenFibSum(long previous, long current, long max, long sum) {
        long next = previous + current;
        if (next > max) return sum;
        if (next % 2 == 0) sum += next;
        return getEvenFibSum(current, next, max, sum);
    }

    private static void printEvenFibonacciNumbers(long n) {
        System.out.println(getEvenFibSum(0, 1, n, 0));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            printEvenFibonacciNumbers(n);
        }
    }

}
