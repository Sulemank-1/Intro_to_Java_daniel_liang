package A07_Single_Dimensional_Arrays.Exercises;

import A07_Single_Dimensional_Arrays.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i=0; i<list1.length; i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i< list2.length; i++)
            list2[i] = input.nextInt();

        System.out.println("Two list" + (equals(list1, list2) ? " are ":" are not ") + "identical.");
    }

    public static boolean equals(int[] list1, int[] list2){
        SelectionSort.selectionSort(list1);
        SelectionSort.selectionSort(list2);

        return Exercise07_26.equals(list1, list2);
    }


}
