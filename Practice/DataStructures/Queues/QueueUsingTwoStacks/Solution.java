package Practice.DataStructures.Queues.QueueUsingTwoStacks;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    private static Stack<Integer> q = new Stack<>();
    private static Stack<Integer> tmp = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] query = sc.nextLine().split(" ");
            if (query.length >= 1 && (query[0].equals("1") || query[0].equals("2") || query[0].equals("3"))) {
                if (Integer.parseInt(query[0]) == 1) {
                    enqueue(Integer.parseInt(query[1]));
                }
                if (Integer.parseInt(query[0]) == 2) {
                    dequeue();
                }
                if (Integer.parseInt(query[0]) == 3) {
                    System.out.println(peek());
                }
            }
        }
    }

    private static void enqueue(int num) {
        tmp.push(num);
    }

    private static void dequeue() {
        if (q.isEmpty()) {
            while (!tmp.isEmpty()) {
                q.push(tmp.pop());
            }
        }
        if (!q.isEmpty()) q.pop();
    }

    private static int peek() {
        if (q.isEmpty()) {
            while (!tmp.isEmpty()) {
                q.push(tmp.pop());
            }
        }
        return q.peek();
    }
}
