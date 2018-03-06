package Practice.Algorithms.Implementation.DayOfTheProgrammer;

import java.util.Scanner;

public class Solution {

    private static boolean isLeap(int year) {
        if (year < 1918) return year % 4 == 0;
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }

    private static String solve(int year) {
        int day = 13;
        int month = 9;
        if (year == 1918) {
            day = 26;
        } else if (isLeap(year)) day--;
        String d = String.format("%02d", day);
        String m = String.format("%02d", month);
        return d + "." + m + "." + year;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }

}
