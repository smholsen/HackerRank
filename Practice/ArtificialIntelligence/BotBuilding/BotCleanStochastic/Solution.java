package Practice.ArtificialIntelligence.BotBuilding.BotCleanStochastic;

import java.util.*;

public class Solution {

    static Node[][] map;

    private static void nextMove(int posr, int posc, String[] board) {
        int[] currentPos = new int[]{posr, posc};
        // First create the grid with objects so we can do fast BFS.
        map = buildGrid(board);
        // Find the closest dirty spot using BFS.
        Node nearestDirty = getNearestDirty(currentPos, map);
        // Print next Action
        if (nearestDirty != null) {
            printNextAction(currentPos, nearestDirty);
        }
    }

    private static void printNextAction(int[] currentPos, Node nearestDirty) {
        // If on same spot print CLEAN.
        if (currentPos[0] == nearestDirty.i && currentPos[1] == nearestDirty.j) {
            System.out.println("CLEAN");
        } else if (nearestDirty.i < currentPos[0]) {
            System.out.println("UP");
        } else if (nearestDirty.i > currentPos[0]) {
            System.out.println("DOWN");
        } else if (nearestDirty.j < currentPos[1]) {
            System.out.println("LEFT");
        } else if (nearestDirty.j > currentPos[1]) {
            System.out.println("RIGHT");
        }
    }

    private static Node getNearestDirty(int[] current, Node[][] board) {
        // BFS
        Set<Node> visited = new HashSet<>();
        Queue<Node> q = new LinkedList<>();
        // Add Initial position to Queue.
        q.add(board[current[0]][current[1]]);
        while (!q.isEmpty()) {
            Node c = q.poll();
            visited.add(c);
            if (c.data == 'd') return c;
            for (Node n : c.getNeighbors()) {
                if (!visited.contains(n)) q.add(n);
            }
        }
        return null;
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
            if (i > 0) result.add(map[i - 1][j]);
            // Down
            if (i < map.length - 1) result.add(map[i + 1][j]);
            // Left
            if (j > 0) result.add(map[i][j - 1]);
            // Right
            if (j < map[i].length - 1) result.add(map[i][j + 1]);
            return result;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] pos = new int[2];
        String board[] = new String[5];
        for (int i = 0; i < 2; i++) pos[i] = in.nextInt();
        for (int i = 0; i < 5; i++) board[i] = in.next();
        nextMove(pos[0], pos[1], board);
    }

}
