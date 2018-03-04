package Practice.DataStructures.Stacks.MaximumElement;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    // Retrieves max in Stack in O(1) time.

    private static int currentMaxInStack = Integer.MIN_VALUE;
    private static Stack<Node> maxStack = new Stack<>();

    static class Node {
        int val;
        int maxBelow;

        Node(int val, int max) {
            this.val = val;
            this.maxBelow = max;
        }
    }

    private static void push(int val) {
        currentMaxInStack = Math.max(currentMaxInStack, val);
        maxStack.push(new Node(val, currentMaxInStack));
    }

    private static void pop() {
        if (maxStack.isEmpty()) return;
        maxStack.pop();
        currentMaxInStack = (maxStack.isEmpty()) ? Integer.MIN_VALUE : maxStack.peek().maxBelow;
    }

    private static void printMax() {
        System.out.println(currentMaxInStack);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nInputs = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < nInputs; i++) {
            int[] ops = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (ops[0] == 1) push(ops[1]);
            if (ops[0] == 2) pop();
            if (ops[0] == 3) printMax();
        }
    }

}
