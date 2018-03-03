package Practice.DataStructures.Trees.BinarySearchTreeInsertion;

public class Solution {

    // Node is defined as :
    static class Node {
        int data;
        Node left;
        Node right;
    }

    static Node Insert(Node root, int value) {
        Node current = root;
        Node newNode = new Node();
        newNode.data = value;
        if (root == null) return newNode;
        while (true) {
            if (value < current.data) {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                } else {
                    current = current.right;
                }
            }
        }
        return root;
    }


}
