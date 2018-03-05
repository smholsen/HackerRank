package Practice.Algorithms.Implementation.BetweenTwoSets;

import java.util.*;

public class Solution {

    private static int getTotalX(int[] a, int[] b) {
        List<Integer> c = getFactorsOfAll(b);
        List<Integer> result = new ArrayList<>();

        for (int n : c) {
            if (allAreFactors(n, a)) result.add(n);
        }
        return result.size();
    }

    private static boolean allAreFactors(int n, int[] factors) {
        Set<Integer> nFactors = new HashSet<>(getFactors(n));
        for (int f : factors) {
            if (!nFactors.contains(f)) return false;
        }
        return true;
    }

    private static List<Integer> getFactorsOfAll(int[] l) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            if (i == 0) {
                // First list
                result = getFactors(l[i]);
            } else {
                Set<Integer> factors = new HashSet<>(getFactors(l[i]));
                List<Integer> toRemove = new ArrayList<>();
                for (int j : result) {
                    if (!factors.contains(j)) {
                        toRemove.add(j);
                    }
                }
                result.removeAll(toRemove);
            }
        }
        return result;
    }

    private static List<Integer> getFactors(int n) {
        List<Integer> result = new ArrayList<>();
        for (Integer i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result.add(i);
                // If not sqr
                if (i != n / i) {
                    result.add(n / i);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
