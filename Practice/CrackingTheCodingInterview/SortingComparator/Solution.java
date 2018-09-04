package Practice.CrackingTheCodingInterview.SortingComparator;


import java.util.Comparator;

public class Solution {

    class Player {
        int score;
        String name;
    }

    class Checker implements Comparator<Player> {
        // complete this method
        public int compare(Player a, Player b) {
            if (a.score != b.score) {
                return b.score - a.score;
            } else {
                return a.name.compareTo(b.name);
            }
        }
    }
}

