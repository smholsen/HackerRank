package Practice.ArtificialIntelligence.BotBuilding.BotSavesPrincess;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    private static void displayPathToPrincess(int n, String[] grid) {
        int[] princess = getPrincessPos(grid);
        int[] current = new int[]{grid.length / 2, grid.length / 2};
        while (true) {
            if (Arrays.equals(current, princess)) return;
            assert princess != null;
            if (princess[0] < current[0]) {
                System.out.println("UP");
                current[0]--;
                continue;
            }
            if (princess[0] > current[0]) {
                System.out.println("DOWN");
                current[0]++;
                continue;
            }
            if (princess[1] < current[1]) {
                System.out.println("LEFT");
                current[1]--;
                continue;
            }
            if (princess[1] > current[1]) {
                System.out.println("RIGHT");
                current[1]++;
            }
        }
    }

    private static int[] getPrincessPos(String[] grid) {
        if (grid[0].charAt(0) == 'p') return new int[]{0, 0};
        if (grid[0].charAt(grid.length - 1) == 'p') return new int[]{0, grid.length - 1};
        if (grid[grid.length - 1].charAt(0) == 'p') return new int[]{grid.length - 1, 0};
        if (grid[grid.length - 1].charAt(grid.length - 1) == 'p') return new int[]{grid.length - 1, grid.length - 1};
        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for (int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

        displayPathToPrincess(m, grid);
    }

}
