package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double KG_PER_POUND = 0.45359237;
        final double INCHES_PER_FOOT = 12;
        final double METERS_PER_INCH = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        weight *= KG_PER_POUND;

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();


        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        double height =  feet * INCHES_PER_FOOT + inches;
        height *= METERS_PER_INCH;

        double bmi = weight / Math.pow(height, 2);

        System.out.println("BMI is " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if(bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }



}
