package Practice.CrackingTheCodingInterview.TreesIsThisABinarySearchTree;

import java.util.*;

public class Solution {
    // Hidden stub code will pass a root argument to the function below.
    // Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

    class Node {
        int data;
        Node left;
        Node right;
    }

    private Set<Integer> set = new HashSet<>();

    boolean checkBST(Node root) {
        return checkValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkValid(Node node, int min, int max) {
        if (node == null) return true;
        if (set.contains(node.data)) return false;
        set.add(node.data);
        return node.data <= max && node.data >= min &&
                checkValid(node.left, min, node.data) &&
                checkValid(node.right, node.data, max);
    }
}

