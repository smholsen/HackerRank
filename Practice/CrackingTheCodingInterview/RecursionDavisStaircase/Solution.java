package Practice.CrackingTheCodingInterview.RecursionDavisStaircase;

import java.io.*;
import java.util.*;

public class Solution {

    private static Map<Integer, Integer> solvedPerms = new HashMap<>();

    // Complete the stepPerms function below.
    private static int stepPerms(int n) {
        int ans = getTotalPerms(n);
        return (int) (ans % Long.parseLong("10000000007"));
    }

    private static int getTotalPerms(int n) {
        if (n == 0) return 1;
        else if (n == 1) return 1;
        else if (n == 2) return 2;
        else if (n == 3) return 4;
        if (solvedPerms.keySet().contains(n)) {
            return solvedPerms.get(n);
        } else {
            int ans = getTotalPerms(n - 1) + getTotalPerms(n - 2) + getTotalPerms(n - 3);
            solvedPerms.put(n, ans);
            return ans;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int sItr = 0; sItr < s; sItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int res = stepPerms(n);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
