package Practice.Algorithms.Warmup.PlusMinus;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    static void plusMinus(int[] arr) {
        DecimalFormat numberFormat = new DecimalFormat("#.000000");
        int count = arr.length;
        long positives = IntStream.of(arr).filter(i -> i > 0).count();
        long negatives = IntStream.of(arr).filter(i -> i < 0).count();
        long zeros = IntStream.of(arr).filter(i -> i == 0).count();
        System.out.println((double) positives / count);
        System.out.println((double) negatives / count);
        System.out.println((double) zeros / count);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
