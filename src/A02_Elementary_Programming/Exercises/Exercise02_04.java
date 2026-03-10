package A02_Elementary_Programming.Exercises;

import java.util.Scanner;

public class Exercise02_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pounds;
        double kilograms;

        System.out.print("Enter a number in pounds: ");
        pounds = input.nextDouble();

        kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }



}
