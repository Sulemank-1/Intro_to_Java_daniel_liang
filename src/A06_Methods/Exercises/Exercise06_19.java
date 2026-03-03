package A06_Methods.Exercises;

import java.util.Scanner;

public class Exercise06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3)) {
            System.out.printf("The area of the triangle is %.2f\n", area(side1, side2, side3));
        } else {
            System.out.println("Invalid input: The sum of two sides must be greater than the third side.");
        }

        input.close();

    }

    public static boolean isValid(double side1, double side2, double side3){
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    public static double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2.0;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }


}
