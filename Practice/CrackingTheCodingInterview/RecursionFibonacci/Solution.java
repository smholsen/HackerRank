package Practice.CrackingTheCodingInterview.RecursionFibonacci;

import java.util.*;

public class Solution {
    private static Map<Integer, Integer> solvedFibs = new HashMap<>();

    private static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (solvedFibs.keySet().contains(n)) {
            return solvedFibs.get(n);
        } else {
            int answer = fibonacci(n - 1) + fibonacci(n - 2);
            solvedFibs.put(n, answer);
            return answer;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}