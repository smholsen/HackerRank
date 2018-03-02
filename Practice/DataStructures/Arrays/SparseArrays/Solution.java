package Practice.DataStructures.Arrays.SparseArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int numberOfInputLines = sc.nextInt();
        for (int i = 0; i < numberOfInputLines; i++) {
            String currentString = sc.next();
            map.put(currentString, (map.get(currentString) == null) ? 1 : map.get(currentString) + 1);
        }
        int numberOfQueries = sc.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {
            String query = sc.next();
            System.out.println((map.get(query) == null) ? 0 : map.get(query));
        }
    }
}
