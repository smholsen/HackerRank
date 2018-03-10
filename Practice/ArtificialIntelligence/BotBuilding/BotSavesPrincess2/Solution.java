package Practice.ArtificialIntelligence.BotBuilding.BotSavesPrincess2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    private static void nextMove(int n, int r, int c, String[] grid) {
        int[] princess = getPrincessPos(grid);
        int[] current = new int[]{r, c};
        if (Arrays.equals(current, princess)) return;
        assert princess != null;
        if (princess[0] < current[0]) {
            System.out.println("UP");
            return;
        }
        if (princess[0] > current[0]) {
            System.out.println("DOWN");
            return;
        }
        if (princess[1] < current[1]) {
            System.out.println("LEFT");
            return;
        }
        if (princess[1] > current[1]) {
            System.out.println("RIGHT");
        }
    }

    private static int[] getPrincessPos(String[] grid) {
        // Find princess, can be anywhere on map
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                if (grid[i].charAt(j) == 'p') return new int[]{i, j};
            }
        }
        return null;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, r, c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];


        for (int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

        nextMove(n, r, c, grid);

    }
}
