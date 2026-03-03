package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = new double[10];

        System.out.print("Enter 10 floating values: ");
        for (int i = 0; i < values.length; i++)
            values[i] = input.nextDouble();

        System.out.printf("Minimun value: %.1f" , min(values));
    }

    public static double min(double[] array){
        double min = array[0];
        for (int i = 1; i<array.length; i++){
            if (min >  array[i])
                min = array[i];
        }

        return min;
    }
}
