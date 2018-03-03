package Practice.DataStructures.Trees.TreePostorderTraversal;

public class Solution {

    /* you only have to complete the function given below.
    Node is defined as
    */

    class Node {
        int data;
        Node left;
        Node right;
    }

    private void postOrder(Node root) {
        if (root.left != null) {
            postOrder(root.left);
        }
        if (root.right != null) {
            postOrder(root.right);
        }
        System.out.print(root.data + " ");
    }

}
