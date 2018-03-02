package Practice.DataStructures.Arrays.DynamicArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfSequences = sc.nextInt();
        int numberOfQueries = sc.nextInt();
        int lastAnswer = 0;
        List<List<Integer>> sequences = new ArrayList<>();
        for (int i = 0; i < numberOfSequences; i++) {
            sequences.add(new ArrayList<>());
        }

        for (int i = 0; i < numberOfQueries; i++) {
            int queryType = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sequenceIndex = (x ^ lastAnswer) % numberOfSequences;
            switch (queryType) {
                case 1:
                    // Index of sequence to append y to.
                    sequences.get(sequenceIndex).add(y);
                    break;
                case 2:
                    List<Integer> sequence = sequences.get(sequenceIndex);
                    int elementIndex = y % sequence.size();
                    lastAnswer = sequence.get(elementIndex);
                    System.out.println(lastAnswer);
                    break;
            }
        }
    }
}
