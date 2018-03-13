package Practice.ArtificialIntelligence.AStarSearch.PacManDfs;

import java.util.*;

public class Solution {

    static Node[][] map;

    private static void dfs(int r, int c, int posr, int posc, int food_r, int food_c, String[] board) {
        int[] currentPos = new int[]{posr, posc};
        // First create the grid with objects so we can do BFS.
        map = buildGrid(board);
        // Find the shortest path using BFS.
        findGoal(currentPos, map);
    }

    private static void findGoal(int[] current, Node[][] board) {
        // DFS
        Set<Node> stacked = new HashSet<>();
        Queue<Node> explored = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        // Add Initial position to Queue.
        stack.add(board[current[0]][current[1]]);
        stacked.add(board[current[0]][current[1]]);
        while (!stack.isEmpty()) {
            Node c = stack.pop();
            explored.add(c);
            if (c.data == '.') {
                // At goal.
                // Print number of explored nodes
                System.out.println(explored.size());
                while (!explored.isEmpty()) {
                    // Print each explored node in order of first explored.
                    System.out.println(explored.poll());
                }
                Stack<Node> path = new Stack<>();
                while (c != null) {
                    path.push(c);
                    c = c.pre;
                }
                // Print distance between start & goal
                System.out.println(path.size() - 1);
                while (!path.isEmpty()) {
                    // Print path
                    System.out.println(path.pop());
                }
                return;
            }
            for (Node n : c.getNeighbors()) {
                if (!stacked.contains(n)) {
                    stacked.add(n);
                    stack.add(n);
                    n.pre = c;
                }
            }
        }
    }

    private static Node[][] buildGrid(String[] board) {
        Node[][] result = new Node[board.length][board[0].length()];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                result[i][j] = new Node(i, j, board[i].charAt(j));
            }
        }
        return result;
    }

    static class Node {
        char data;
        Node pre;
        int i;
        int j;

        Node(int i, int j, char data) {
            this.i = i;
            this.j = j;
            this.data = data;
        }

        List<Node> getNeighbors() {
            List<Node> result = new ArrayList<>();
            // Up
            if (i > 0 && map[i - 1][j].data != '%') result.add(map[i - 1][j]);
            // Left
            if (j > 0 && map[i][j - 1].data != '%') result.add(map[i][j - 1]);
            // Right
            if (j < map[i].length - 1 && map[i][j + 1].data != '%') result.add(map[i][j + 1]);
            // Down
            if (i < map.length - 1 && map[i + 1][j].data != '%') result.add(map[i + 1][j]);
            return result;
        }

        @Override
        public String toString() {
            return i + " " + j;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int pacman_r = in.nextInt();
        int pacman_c = in.nextInt();

        int food_r = in.nextInt();
        int food_c = in.nextInt();

        int r = in.nextInt();
        int c = in.nextInt();

        String grid[] = new String[r];

        for (int i = 0; i < r; i++) {
            grid[i] = in.next();
        }

        dfs(r, c, pacman_r, pacman_c, food_r, food_c, grid);
    }
}