package Practice.Algorithms.Implementation.CavityMap;

import java.util.Scanner;

public class Solution {

    private static String[] cavityMap(String[] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                if (isCavity(i, j, grid)) {
                    StringBuilder newString = new StringBuilder(grid[i]);
                    newString.setCharAt(j, 'X');
                    grid[i] = newString.toString();
                }
            }
        }
        return grid;
    }

    private static boolean isCavity(int i, int j, String[] grid) {
        if (i > 0 && i < grid.length - 1 && j > 0 && j < grid[i].length() - 1) {
            int current = Character.getNumericValue(grid[i].charAt(j));
            return Character.getNumericValue(grid[i - 1].charAt(j)) < current &&
                    Character.getNumericValue(grid[i + 1].charAt(j)) < current &&
                    Character.getNumericValue(grid[i].charAt(j - 1)) < current &&
                    Character.getNumericValue(grid[i].charAt(j + 1)) < current;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for (int grid_i = 0; grid_i < n; grid_i++) {
            grid[grid_i] = in.next();
        }
        String[] result = cavityMap(grid);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
