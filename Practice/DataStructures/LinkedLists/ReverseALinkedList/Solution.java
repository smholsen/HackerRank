package Practice.DataStructures.LinkedLists.ReverseALinkedList;

import java.util.Stack;

public class Solution {

    /*
    Reverse a linked list and return pointer to the head
    The input list will have at least one element
    Node is defined as
    */

    class Node {
        int data;
        Node next;
    }

    // This is a "method-only" submission.
    // You only need to complete this method.
    Node Reverse(Node head) {
        Stack<Node> stack = new Stack<>();
        if (head == null) {
            return null;
        }
        stack.push(head);
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            stack.push(currentNode);
        }
        Node newHead = stack.pop();
        Node previousNode = newHead;
        while (!stack.empty()) {
            Node nextNode = stack.pop();
            previousNode.next = nextNode;
            previousNode = nextNode;
        }
        head.next = null;
        return newHead;
    }
}
