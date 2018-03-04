package Practice.Algorithms.Implementation.MatrixLayerRotation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

    static void matrixRotation(int[][] matrix, int r) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int numLayers = Math.min(matrix.length, matrix[0].length) / 2;
        ArrayList<LinkedList<Integer>> layers = new ArrayList<>();
        LinkedList<Integer> layer = new LinkedList<>();
        int[][] rotatedMatrix = new int[matrix.length][matrix[0].length];
        for (int currentLayer = 0; currentLayer < numLayers; currentLayer++) {
            int i = currentLayer;
            int j = currentLayer;
            while (i < (rows - 1) - currentLayer) {
                layer.add(matrix[i][j]);
                i++;
            }
            while (j < (columns - 1) - currentLayer) {
                layer.add(matrix[i][j]);
                j++;
            }
            while (i > currentLayer) {
                layer.add(matrix[i][j]);
                i--;
            }
            while (j > currentLayer) {
                layer.add(matrix[i][j]);
                j--;
            }
            layers.add(layer);
            layer = new LinkedList<>();
        }
        for (LinkedList<Integer> layerList : layers) {
            int differenceRotation = r % layerList.size();
            for (int i = 0; i < differenceRotation; i++) {
                int toPrepend = layerList.removeLast();
                layerList.addFirst(toPrepend);
            }
        }

        for (int currentLayer = 0; currentLayer < numLayers; currentLayer++) {
            int i = currentLayer;
            int j = currentLayer;
            LinkedList<Integer> currentLayerData = layers.get(i);
            while (i < (rows - 1) - currentLayer) {
                rotatedMatrix[i][j] = currentLayerData.remove();
                i++;
            }
            while (j < (columns - 1) - currentLayer) {
                rotatedMatrix[i][j] = currentLayerData.remove();
                j++;
            }
            while (i > currentLayer) {
                rotatedMatrix[i][j] = currentLayerData.remove();
                i--;
            }
            while (j > currentLayer) {
                rotatedMatrix[i][j] = currentLayerData.remove();
                j--;
            }
        }
        for (int[] row : rotatedMatrix) {
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i < row.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int r = in.nextInt();
        int[][] matrix = new int[m][n];
        for (int matrix_i = 0; matrix_i < m; matrix_i++) {
            for (int matrix_j = 0; matrix_j < n; matrix_j++) {
                matrix[matrix_i][matrix_j] = in.nextInt();
            }
        }
        matrixRotation(matrix, r);
        in.close();
    }
}
