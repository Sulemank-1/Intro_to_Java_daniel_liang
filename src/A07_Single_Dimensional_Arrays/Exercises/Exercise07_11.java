package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }

        System.out.println("The mean is " + mean(numbers));
        System.out.println("The standard deviation is " + deviation(numbers));
    }

    public static double deviation(double[] x){
        double deviation = 0;
        double mean = mean(x);
        for (double i : x) {
            deviation += Math.pow(i - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }

    public static double mean(double[] x){
        double mean = 0.0;
        for(double i: x)
            mean+=i;

        return mean / x.length;

    }
}
