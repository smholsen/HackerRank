package Practice.Algorithms.Implementation.BeautifulTriplets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    private static int beautifulTriplets(int d, int[] arr) {
        int sum = 0;
        // First we construct a Set containing all numbers in the array
        // We can use this to quickly check if a number is in the array
        Set<Integer> set = new HashSet<>();
        for (int n : arr) set.add(n);
        for (int i = 0; i < arr.length; i++)
            if (set.contains(arr[i] + d) && set.contains(arr[i] + (2 * d))) sum++;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int result = beautifulTriplets(d, arr);
        System.out.println(result);
        in.close();
    }
}