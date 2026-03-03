package A02_Elementary_Programming;

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        double area;
        double radius;
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        radius = input.nextDouble();

        area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
