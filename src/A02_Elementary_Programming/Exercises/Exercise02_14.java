package A02_Elementary_Programming.Exercises;

import java.util.Scanner;

public class Exercise02_14 {
    public static void main(String[] args) {

    }

    public static void BMI(){
        Scanner input = new Scanner(System.in);
        double weight;
        double height;
        double bmi;

        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();
        weight = weight * 0.45359237;

        System.out.print("Enter height in inches: ");
        height = input.nextDouble();
        height = height * 0.0254;

        bmi = weight / Math.pow(height, 2);

        System.out.println("BMI is " + bmi);




    }

}
