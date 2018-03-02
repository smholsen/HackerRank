package Practice.DataStructures.Stacks.BalancedBrackets;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    private static String isBalanced(String s) {
        HashMap<String, String> brackets = new HashMap<>();
        brackets.put("[", "]");
        brackets.put("(", ")");
        brackets.put("{", "}");

        Stack<String> stack = new Stack<>();
        for (String bracket : s.split("")) {
            // If char is an opening Bracket
            if (brackets.keySet().contains(bracket)) {
                stack.push(bracket);
            } else if (brackets.values().contains(bracket)) {
                // If closing bracket
                if (stack.empty()) {
                    return "NO";
                }
                String previousBracket = stack.pop();
                if (! (brackets.get(previousBracket).equals(bracket))) {
                    return "NO";
                }
            }
        }
        if (!stack.empty()) {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }

}
