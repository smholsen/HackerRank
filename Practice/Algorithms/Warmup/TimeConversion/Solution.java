package Practice.Algorithms.Warmup.TimeConversion;

import java.util.Scanner;

public class Solution {

    private static String timeConversion(String s) {
        if (s.substring(s.length() - 2).equals("AM")) {
            String h = (Integer.valueOf(s.substring(0, 2)) == 12) ? "00" : s.substring(0, 2);
            return h.concat(s.substring(2, s.length() - 2));
        } else {
            String h = (Integer.valueOf(s.substring(0, 2)) == 12) ?
                    "12" : String.valueOf(Integer.valueOf(s.substring(0, 2)) + 12);
            return h + s.substring(2, s.length() - 2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

}
