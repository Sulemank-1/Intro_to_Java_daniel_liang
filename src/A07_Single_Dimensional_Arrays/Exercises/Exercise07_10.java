package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = new double[10];

        System.out.print("Enter 10 floating values: ");
        for (int i = 0; i < values.length; i++)
            values[i] = input.nextDouble();

        System.out.printf("Minimum index: %d", indexOfSmallestElement(values));
    }

    public static int indexOfSmallestElement(double[] array){
        double min = array[0];
        int minIndex = 0;
        for (int i = 1; i<array.length; i++){
            if (min >  array[i]){
                min = array[i];
                minIndex = i;
            }

        }

        return minIndex;
    }
}
