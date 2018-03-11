package Practice.Algorithms.Implementation.CutTheSticks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    private static int[] cutTheSticks(int[] arr) {
        // Runs in O(n) time
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int lowIdx = 0;
        int minStickLength = arr[0];
        while (i < arr.length) {
            if (arr[i] > minStickLength) {
                list.add(arr.length - (lowIdx));
                lowIdx = i ;
                minStickLength += arr[i] - minStickLength;
            }
            i++;
            // Add last
            if (i == arr.length) {
                list.add(arr.length - (lowIdx));
            }
        }
        // Convert to int array
        int[] result = new int[list.size()];
        for (int j = 0; j < list.size(); j++) result[j] = list.get(j);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }

}
