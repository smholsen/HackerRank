package Practice.Algorithms.Implementation.LisasWorkbook;

import java.util.Scanner;

public class Solution {

    private static int workbook(int n, int k, int[] arr) {
        int page = 0;
        int sum = 0;
        for (int problems : arr) {
            page++;
            for (int j = 1; j <= problems; j++) {
                if (j != 1 && (j - 1) % (k) == 0) page++;
                if (j == page) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int result = workbook(n, k, arr);
        System.out.println(result);
        in.close();
    }
}