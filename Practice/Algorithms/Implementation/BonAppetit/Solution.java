package Practice.Algorithms.Implementation.BonAppetit;

import java.util.Scanner;

public class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i != k) {
                sum += sc.nextInt();
            } else {
                sc.nextInt();
            }
        }
        int diff = sc.nextInt() - (sum / 2);
        if (diff == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(diff);
        }
    }

}
