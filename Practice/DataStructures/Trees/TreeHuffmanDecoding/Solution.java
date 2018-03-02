package Practice.DataStructures.Trees.TreeHuffmanDecoding;

public class Solution {

    class Node {
        public int frequency; // the frequency of this tree
        public char data;
        Node left, right;
    }

    void decode(String S, Node root) {
        Node node = root;
        for (char b : S.toCharArray()) {
            node = (b == '0') ? node.left : node.right;
            if (node.data != '\0') {
                System.out.print(node.data);
                node = root;
            }
        }
    }

}
