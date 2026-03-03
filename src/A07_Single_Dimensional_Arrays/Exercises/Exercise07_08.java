package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = new double[10];

        System.out.print("Enter 10 floating values: ");
        for (int i = 0; i < 10; i++)
            values[i] = input.nextDouble();

        System.out.printf("Average: %.2f" , average(values));

    }

    public static int average(int[] array){
        int sum = 0;
        for(int i: array){
            sum+=i;
        }

        return sum / array.length;
    }

    public static double average(double[] array){
        double sum = 0;
        for(double i: array){
            sum+=i;
        }

        return sum / array.length;
    }
}
