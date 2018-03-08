package Practice.Algorithms.Implementation.SequenceEquation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static int[] permutationEquation(int[] p) {
        Map<Integer, Integer> pValues = new HashMap<>();
        int[] result = new int[p.length];
        // 1 Indexed
        for (int i = 1; i <= p.length; i++)
            pValues.put(p[i - 1], i);
        for (int j = 0; j < p.length; j++) {
            result[j] = pValues.get(pValues.get(j + 1));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int[] result = permutationEquation(p);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");

        in.close();
    }

}
