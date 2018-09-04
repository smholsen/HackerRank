package Practice.Algorithms.ConstructiveAlgorithms.NewYearChaos;

import java.util.*;

public class Solution {

    // Complete the minimumBribes function below.
    private static void minimumBribes(int[] q) {
        boolean sorted = false;
        int bribes = 0;
        if (q.length < 2) System.out.println(bribes);
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < q.length - 1; i++) {
                if (q[i] - i > 3) {
                    System.out.println("Too chaotic");
                    return;
                }
                if (q[i] > q[i+1]) {
                    sorted = false;
                    q = swap(q, i, i+1);
                    bribes++;
                }
            }
        }
        System.out.println(bribes);
    }

    private static int[] swap(int[] q, int i, int j) {
        int tmp = q[i];
        q[i] = q[j];
        q[j] = tmp;
        return q;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
