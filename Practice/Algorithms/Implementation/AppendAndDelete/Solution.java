package Practice.Algorithms.Implementation.AppendAndDelete;

import java.util.Scanner;

public class Solution {

    private static final String yes = "Yes";
    private static final String no = "No";

    private static String appendAndDelete(String s, String t, int k) {
        String shortest = (s.length() > t.length()) ? t : s;
        String longest = (shortest.equals(s)) ? t : s;
        int similarFirstPart = 0;
        for (int i = 0; i < shortest.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) similarFirstPart++;
            else break;
        }
        // Insufficient k
        if (k < (longest.length() + shortest.length() - (similarFirstPart * 2))) return no;
        // If we can delete more than 1 full string and have enough to build it will always be sufficient
        if (k > shortest.length() + longest.length()) return yes;
        // If we dont have this many k it can still work but only if we have exact amount of
        // k. (1 too many or few wont work, but any mod 2 will still work as we can add->delete)
        if (k % 2 == (longest.length() + shortest.length() - (similarFirstPart * 2)) % 2) return yes;
        return no;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        String result = appendAndDelete(s, t, k);
        System.out.println(result);
        in.close();
    }

}
