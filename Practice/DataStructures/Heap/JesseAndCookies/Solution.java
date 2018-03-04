package Practice.DataStructures.Heap.JesseAndCookies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static class Cookie implements Comparable<Cookie>{
        int sweetness;

        Cookie (int sweetness) {
            this.sweetness = sweetness;
        }

        @Override
        public int compareTo(Cookie other) {
            return this.sweetness - other.sweetness;
        }

        @Override
        public String toString() {
            return String.valueOf(sweetness);
        }
    }

    static class CookieMinHeap {
        List<Cookie> list = new ArrayList<>();

        void add (Cookie c) {
            list.add(c);
            bubbleUp(list.size() - 1);
        }

        Cookie pop() {
            if (list.size() > 1) {
                swap(0, list.size() - 1);
                Cookie min = list.remove(list.size() - 1);
                bubbleDown(0);
                return min;
            } else {
                if (list.size() == 1) {
                    return list.remove(0);
                }
            }
            return null;
        }

        Cookie peek() {
            return list.get(0);
        }

        int size() {
            return list.size();
        }

        private void bubbleUp(int i) {
            while (i > 0 && list.get(getParent(i)).compareTo(list.get(i)) > 0) {
                swap(i, getParent(i));
                i = getParent(i);
            }
        }

        private void bubbleDown(int i) {
            if (left(i) > list.size() - 1) return;
            if (right(i) > list.size() - 1) {
                if (list.get(left(i)).compareTo(list.get(i)) < 0) {
                    swap(i, left(i));
                    bubbleDown(left(i));
                    return;
                } else {
                    return;
                }
            }
            if (list.get(left(i)).compareTo(list.get(right(i))) < 0) {
                if (list.get(left(i)).compareTo(list.get(i)) < 0) {
                    swap(i, left(i));
                    bubbleDown(left(i));
                }
            } else {
                if (list.get(right(i)).compareTo(list.get(i)) < 0) {
                    swap(i, right(i));
                    bubbleDown(right(i));
                }
            }
        }

        private int left(int i) {
            return (2*i) + 1;
        }

        private int right(int i) {
            return (2*i) + 2;
        }

        private void swap(int i, int i1) {
            Cookie tmp = list.get(i);
            list.set(i, list.get(i1));
            list.set(i1, tmp);
        }

        private int getParent(int i) {
            return (i-1)/2;
        }

        @Override
        public String toString() {
            return list.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] meta = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int nCookies = meta[0];
        int k = meta[1];
        CookieMinHeap minHeap = new CookieMinHeap();
        for (int i = 0; i < nCookies; i++) {
            // Build Heap.
            minHeap.add(new Cookie(sc.nextInt()));
        }
        int nMerges = 0;
        boolean success = true;
        while(minHeap.peek() != null && minHeap.peek().sweetness < k) {
            // While the least sweet element is less than our threshold, we merge it with the next least sweet cookie.
            if (minHeap.size() < 2) {
                // No more cookies to merge...
                System.out.println(-1);
                success = false;
                break;
            } else {
                Cookie leastSweet = minHeap.pop();
                Cookie nextLeastSweet = minHeap.pop();
                Cookie mergedCookie = new Cookie(leastSweet.sweetness + (2*nextLeastSweet.sweetness));
                minHeap.add(mergedCookie);
                nMerges++;
            }
        }
        if (success) System.out.println(nMerges);
    }
}
