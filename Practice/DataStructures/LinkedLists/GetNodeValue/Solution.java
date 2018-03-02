package Practice.DataStructures.LinkedLists.GetNodeValue;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
    Get Nth element from the end in a linked list of integers
    Number of elements in the list will always be greater than N.
    Node is defined as
    */
    
    class Node {
        int data;
        Node next;
    }


    int GetNode(Node head, int n) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        // Assume head is never null
        List<Node> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        return list.get(list.size() - (n + 1)).data;
    }

}
