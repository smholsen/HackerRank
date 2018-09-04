package Practice.CrackingTheCodingInterview.DFSConnectedCellsInAGrid;

import java.io.*;
import java.util.*;

public class Solution {
    private int[][] map;
    private int maxIsland;

    // Complete the maxRegion function below.
    private int maxRegion(int[][] grid) {
        this.map = grid;
        this.maxIsland = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 1) {
                    int size = getSize(i, j);
                    maxIsland = Math.max(maxIsland, size);
                    size = 0;
                }
            }
        }
        return maxIsland;
    }

    private int getSize(int row, int col) {
        if (!isIsland(row, col)) return 0;
        int size = 1;
        map[row][col] = 0;
        for (int[] neighbor : getNeighbors(row, col)) {
            size += getSize(neighbor[0], neighbor[1]);
        }
        return size;
    }

    private boolean isIsland(int row, int col) {
        return row >= 0 && row <= map.length - 1 && col >= 0 && col <= map[0].length - 1 && map[row][col] == 1;
    }

    private List<int[]> getNeighbors(int row, int col) {
        List<int[]> result = new ArrayList<>();
        result.add(new int[]{row - 1, col - 1});
        result.add(new int[]{row - 1, col});
        result.add(new int[]{row - 1, col + 1});
        result.add(new int[]{row, col - 1});
        result.add(new int[]{row, col + 1});
        result.add(new int[]{row + 1, col - 1});
        result.add(new int[]{row + 1, col});
        result.add(new int[]{row + 1, col + 1});
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] gridRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < m; j++) {
                int gridItem = Integer.parseInt(gridRowItems[j]);
                grid[i][j] = gridItem;
            }
        }

        int res = new Solution().maxRegion(grid);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
