package Practice.Algorithms.Implementation.LibraryFine;

import java.util.Scanner;

public class Solution {

    private static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y2 < y1) return 10000;
        if (m2 < m1 && y1 == y2) return 500 * (m1 - m2);
        if (d2 < d1 && m1 == m2 && y1 == y2) return 15 * (d1 - d2);
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int result = libraryFine(d1, m1, y1, d2, m2, y2);
        System.out.println(result);
        in.close();
    }

}
