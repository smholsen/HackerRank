package Practice.DataStructures.Trie.Contacts;

import java.io.*;
import java.util.*;

public class Solution {
    private Node root = new Node('+');

    class Node {
        char data;
        Map<Character, Node> map = new HashMap<>();
        int counts = 0;
        public Node (char data) {
            this.data = data;
        }

        void add(String name) {
            counts++;
            if (name.length() != 0) {
                String remainingName = name.substring(1);
                if (map.get(name.charAt(0)) == null) {
                    map.put(name.charAt(0), new Node(name.charAt(0)));
                    map.get(name.charAt(0)).add(remainingName);
                } else {
                    map.get(name.charAt(0)).add(remainingName);
                }
            }
        }

        int find(String name) {
            if (name.length() == 0) return counts;
            if (!map.keySet().contains(name.charAt(0))) return 0;
            else {
                return map.get(name.charAt(0)).find(name.substring(1));
            }
        }
    }

    private int[] contacts(String[][] queries) {
        List<Integer> finds = new ArrayList<>();
        for (String[] query : queries) {
            if (query[0].equals("add")) {
                root.add(query[1]);
            } else if (query[0].equals("find")) {
                finds.add(root.find(query[1]));
            }
        }
        // Make primitive Array
        int[] arr = new int[finds.size()];
        for(int i = 0; i < finds.size(); i++) {
            arr[i] = finds.get(i);
        }
        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesRows = Integer.parseInt(scanner.nextLine().trim());

        String[][] queries = new String[queriesRows][2];

        for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                String queriesItem = queriesRowItems[queriesColumnItr];
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = new Solution().contacts(queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
