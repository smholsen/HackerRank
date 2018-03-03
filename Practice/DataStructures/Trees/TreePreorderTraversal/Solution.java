package Practice.DataStructures.Trees.TreePreorderTraversal;

public class Solution {
    /* you only have to complete the function given below.
    Node is defined as
    */
    class Node {
        int data;
        Node left;
        Node right;
    }

    private void preOrder(Node root) {
        System.out.print(root.data + " ");
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
    }

}
