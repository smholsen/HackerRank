package Practice.DataStructures.Trees.TreeLevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    class Node {
        int data;
        Node left;
        Node right;
    }

    // Simply BFS
    void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node current = q.poll();
            System.out.print(current.data);
            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
            if (!q.isEmpty()) System.out.print(" ");
        }
    }
}
