package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perimeter = 0.0;
        System.out.print("Enter the values of three edges: " );
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if ((a+b > c) && (a+c > b) && (b+c > a))
        {
            perimeter = a + b + c;
            System.out.print("Perimeter: " + perimeter);
        }
        else
            System.out.println("Invalid input.");
    }

}
