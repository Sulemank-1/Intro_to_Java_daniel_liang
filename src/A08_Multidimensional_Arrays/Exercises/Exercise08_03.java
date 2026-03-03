package A08_Multidimensional_Arrays.Exercises;

import A07_Single_Dimensional_Arrays.SelectionSort;

public class Exercise08_03 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},

                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] correctCount = new int[answers.length];

        for (int row = 0; row < answers.length; row++){
            for (int col = 0; col < answers[row].length; col++){
                if (answers[row][col] == keys[col])
                    correctCount[row]++;
            }
        }

        SelectionSort.selectionSort(correctCount);

        for (int i = 0; i < correctCount.length; i++)
            System.out.println("Student " + (i+1) + "'s correct count is " + correctCount[i]);
    }

}
