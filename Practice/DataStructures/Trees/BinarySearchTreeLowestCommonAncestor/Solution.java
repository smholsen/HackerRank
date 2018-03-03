package Practice.DataStructures.Trees.BinarySearchTreeLowestCommonAncestor;

public class Solution {

    // Node is defined as :
    class Node {
        int data;
        Node left;
        Node right;
    }

    static Node lca(Node root, int v1, int v2) {
        Node current = root;
        while (true) {
            if (v1 < current.data && v2 < current.data) {
                current = current.left;
                continue;
            }
            if (v1 > current.data && v2 > current.data) {
                current = current.right;
                continue;
            }
            return current;
        }
    }
}
