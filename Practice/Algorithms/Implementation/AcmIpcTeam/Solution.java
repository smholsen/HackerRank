package Practice.Algorithms.Implementation.AcmIpcTeam;

import java.util.Scanner;

public class Solution {

    private static int[] acmTeam(String[] topic) {
        int max = 0;
        int teams = topic.length;
        for (String aTopic : topic) {
            for (String aTopic1 : topic) {
                int tMax = 0;
                for (int k = 0; k < aTopic.length(); k++) {
                    if (aTopic.charAt(k) == '1' || aTopic1.charAt(k) == '1') tMax++;
                }
                if (tMax > max) {
                    max = tMax;
                    teams = 1;
                } else if (tMax == max) teams++;
            }
        }
        // We count all teams twice
        teams /= 2;
        return new int[]{max, teams};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String[] topic = new String[n];
        for (int topic_i = 0; topic_i < n; topic_i++) {
            topic[topic_i] = in.next();
        }
        int[] result = acmTeam(topic);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");

        in.close();
    }
}