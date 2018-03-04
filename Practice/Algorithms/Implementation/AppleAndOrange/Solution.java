package Practice.Algorithms.Implementation.AppleAndOrange;

import java.util.Scanner;

public class Solution {

    private static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
        int aHits = 0;
        int oHits = 0;
        for(int ap : apples) {
            if (hit(s, t, a, ap)) aHits++;
        }
        for(int or : oranges) {
            if (hit(s, t, b, or)) oHits++;
        }
        System.out.println(aHits);
        System.out.println(oHits);
    }

    private static boolean hit(int s, int t, int x, int y) {
        return ((x + y) >= s && (x+y) <= t);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }

}
