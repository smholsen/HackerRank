package Practice.DataStructures.Stacks.EqualStacks;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for (int h1_i = 0; h1_i < n1; h1_i++) {
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for (int h2_i = 0; h2_i < n2; h2_i++) {
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for (int h3_i = 0; h3_i < n3; h3_i++) {
            h3[h3_i] = in.nextInt();
        }

        List<int[]> originalTowers = new ArrayList<>();
        originalTowers.add(h1);
        originalTowers.add(h2);
        originalTowers.add(h3);

        // Create a new array to store copies of the towers
        // where for each block we store the total height of that block.
        List<int[]> totalHeightPerBlockTowers = new ArrayList<>();
        totalHeightPerBlockTowers.add(new int[n1]);
        totalHeightPerBlockTowers.add(new int[n2]);
        totalHeightPerBlockTowers.add(new int[n3]);
        int[] smallest = totalHeightPerBlockTowers.get(0);
        // We will also store the different heights each tower has in each their own set, as this will make it
        // fast to check whether a tower has a block @ a given height.
        List<Set<Integer>> heightsInTowers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if (totalHeightPerBlockTowers.get(i).length < smallest.length) {
                smallest = totalHeightPerBlockTowers.get(i);
            }
            // For each tower create an array with heights per block.
            // We must iterate in reverse order as the first element is the top one.
            int[] totalH = totalHeightPerBlockTowers.get(i);
            int[] originalTower = originalTowers.get(i);
            int sum = 0;
            Set<Integer> heights = new HashSet<>();
            for (int j = originalTower.length - 1; j > -1; j--) {
                sum += originalTower[j];
                totalH[-j + (originalTower.length - 1)] = sum;
                heights.add(sum);
            }
            heightsInTowers.add(heights);
        }
        // Starting with highest block in the smallest
        // We'll move downwards and check if the other two towers has a block with same height.
        // If they do, then that is the height we want.
        for (int i = smallest.length - 1; i > -1; i--) {
            if (heightsInTowers.get(0).contains(smallest[i]) &&
                    heightsInTowers.get(1).contains(smallest[i]) &&
                    heightsInTowers.get(2).contains(smallest[i])) {
                System.out.println(smallest[i]);
                return;
            }
        }
        System.out.println(0);
    }
}
