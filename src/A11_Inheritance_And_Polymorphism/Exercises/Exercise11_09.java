package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        fillMatrix(matrix);
        printMatrix(matrix);
        findLargestRowAndColumn(matrix);
    }

    public static void fillMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void findLargestRowAndColumn(int[][] matrix){
        int[] rCount = new int[matrix.length];
        int[] cCount = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1){
                    rCount[i]++;
                    cCount[j]++;
                }
            }
        }

        int rMax = findMax(rCount);
        int cMax = findMax(cCount);
        System.out.println("row index " + getIndices(rCount, rMax));
        System.out.println("column index " + getIndices(cCount, cMax));
    }

    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static ArrayList<Integer> getIndices(int[] counts, int max){
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == max)
                indices.add(i);
        }
        return indices;
    }
}
