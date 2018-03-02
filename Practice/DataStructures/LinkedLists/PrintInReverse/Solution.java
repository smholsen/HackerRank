package Practice.DataStructures.LinkedLists.PrintInReverse;

import java.util.Stack;

public class Solution {
    /*
    Print elements of a linked list in reverse order
    head pointer input could be NULL as well for empty list
    Node is defined as
    */

    class Node {
        int data;
        Node next;
    }
    // This is a "method-only" submission.
    // You only need to complete this method.

    void ReversePrint(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Stack<Integer> stack = new Stack<>();
        Node currentNode = head;
        if (head != null) {
            stack.push(head.data);
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                stack.push(currentNode.data);
            }
            while (!stack.empty()) {
                System.out.println(stack.pop());
            }
        }
    }
}
