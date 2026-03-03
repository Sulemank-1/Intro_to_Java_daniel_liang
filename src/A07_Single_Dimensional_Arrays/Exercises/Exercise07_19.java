package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();
        int[] list = new int[size];

        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }


        System.out.printf("The list has %d integers %s\n", size, Arrays.toString(list));
        System.out.println("The list is " + (isSorted(list) ? "sorted":"not sorted"));
    }

    public static boolean isSorted(int[] list){
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1])
                return false;
        }
        return true;
    }
}
