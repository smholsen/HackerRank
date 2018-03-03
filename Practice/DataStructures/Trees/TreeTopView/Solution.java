package Practice.DataStructures.Trees.TreeTopView;

import java.util.Stack;

public class Solution {

    class Node {
        int data;
        Node left;
        Node right;
    }

    void topView(Node root) {
        if (root == null) return;
        Stack<Node> lefties = new Stack<>();
        Node left = root;
        while (left != null) {
            lefties.push(left);
            left = left.left;
        }
        while (!lefties.isEmpty()) {
            System.out.print(lefties.pop().data);
            if (!lefties.isEmpty()) {
                System.out.print(" ");
            }
        }
        Node right = root.right;
        while (right != null) {
            System.out.print(" " + right.data);
            right = right.right;
        }
    }

}
