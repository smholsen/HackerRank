package Practice.DataStructures.Heap.QHEAP1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    static class MinHeap {
        List<Integer> list = new ArrayList<>();

        void add(int n) {
            list.add(n);
            bubbleUp(list.size() - 1);
        }

        void bubbleUp(int i) {
            while(list.get(getParentIndex(i)) > list.get(i) && i != 0) {
                swap(i, getParentIndex(i));
                i = getParentIndex(i);
            }
        }

        void bubbleDown(int i) {
            while (getMinChildIndex(i) != null && list.get(getMinChildIndex(i)) < list.get(i)) {
                int min = getMinChildIndex(i);
                swap(i, min);
                i = min;
            }
        }

        Integer getMinChildIndex(int i) {
            if (left(i) > list.size() - 1) return null;
            if (right(i) > list.size() - 1) {
                return left(i);
            }
            if (list.get(left(i)) < list.get(right(i))) {
                return left(i);
            } else {
                return right(i);
            }
        }

        int left(int i) {
            return (2*i) + 1;
        }

        int right(int i) {
            return (2*i) + 2;
        }

        int getParentIndex(int i) {
            return (i - 1) / 2;
        }

        void swap(int i, int i1) {
            int tmp = list.get(i);
            list.set(i, list.get(i1));
            list.set(i1, tmp);
        }

        void remove(int val) {
            // Find index to remove (linear time) (will never be duplicates).
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == val) {
                    // Swap index to remove with last element and then bubble it down.
                    swap(i, list.size() - 1);
                    list.remove(list.size() - 1);
                    bubbleDown(i);
                    return;
                }
            }
        }

        void printMin() {
            System.out.println(list.get(0));
        }
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        Scanner sc = new Scanner(System.in);
        int q = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String[] s = sc.nextLine().split(" ");
            int operation = Integer.valueOf(s[0]);
            if (s.length > 1) {
                int val = Integer.valueOf(s[1]);
                if (operation == 1) {
                    minHeap.add(val);
                } else if (operation == 2) {
                    minHeap.remove(val);
                }
            }
            if (operation == 3) {
                minHeap.printMin();
            }
        }

    }
}
