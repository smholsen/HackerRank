package Practice.DataStructures.Trees.SwapNodesAlgo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static class Node {
        Node left;
        Node right;
        int index;
        Node(int index) {
            this.index = index;
        }
        @Override
        public String toString() {
            return String.valueOf(index);
        }
    }

    private static void swap(Node root, int currentLevel, int swapLevel) {
        if (currentLevel % swapLevel == 0) {
            Node tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }
        if (root.left != null) swap(root.left, currentLevel + 1, swapLevel);
        if (root.right != null) swap(root.right, currentLevel + 1, swapLevel);
    }

    private static void printInorderTraversal(Node root) {
        if (root.left != null) {
            printInorderTraversal(root.left);
        }
        System.out.print(root + " ");
        if (root.right != null) {
            printInorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Map<Integer, Node> nodes = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int nNodes = Integer.valueOf(sc.nextLine());
        Node root = new Node(1);
        nodes.put(1, root);
        for (int i = 1; i <= nNodes; i++) {
            Node current = (nodes.get(i) == null) ? new Node(i) : nodes.get(i);
            String[] l = sc.nextLine().split(" ");
            int leftNodeIndex = Integer.parseInt(l[0]);
            int rightNodeIndex = Integer.parseInt(l[1]);
            if (leftNodeIndex > -1) {
                Node newNode = new Node(leftNodeIndex);
                current.left = newNode;
                nodes.put(leftNodeIndex, newNode);
            }
            if (rightNodeIndex > -1) {
                Node newNode = new Node(rightNodeIndex);
                current.right = newNode;
                nodes.put(rightNodeIndex, newNode);
            }
        }
        int swaps = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < swaps; i++) {
            swap(root, 1, Integer.valueOf(sc.nextLine()));
            printInorderTraversal(root);
            System.out.println();
        }
    }
}
