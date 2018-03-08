package Practice.Algorithms.Implementation.DesignerPdfViewer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static int designerPdfViewer(int[] h, String word) {
        // Build Map of letters to heights
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> charHeights = new HashMap<>();
        // String.charAt(int i) is constant time.
        for (int i = 0; i < alphabet.length(); i++) {
            charHeights.put(alphabet.charAt(i), h[i]);
        }
        // Find max height
        int max = 0;
        for (char c : word.toCharArray()) {
            int height = charHeights.get(c);
            max = (height > max) ? height : max;
        }
        return word.length() * max;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for (int h_i = 0; h_i < 26; h_i++) {
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }

}
