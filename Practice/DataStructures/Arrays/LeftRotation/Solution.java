package Practice.DataStructures.Arrays.LeftRotation;

import java.util.Scanner;

public class Solution {
    private static int[] leftRotation(int[] a, int d) {
        int shiftsAfterCompleteRotations = d % a.length;
        int[] resultList = new int[a.length];
        System.arraycopy(a, shiftsAfterCompleteRotations, resultList, 0, a.length - shiftsAfterCompleteRotations);
        System.arraycopy(a, 0, resultList, a.length - shiftsAfterCompleteRotations, shiftsAfterCompleteRotations);
        return resultList;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
