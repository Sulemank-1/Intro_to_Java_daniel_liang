package A02_Elementary_Programming.Exercises;

import java.util.Scanner;

public class Exercise02_02 {
    public static void main(String[] args) {

    }

    public static void volumeOfCylinder(){
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;
        double radius;
        double length;
        double area;
        double volume;

        System.out.print("Enter radius and length: ");
        radius = input.nextDouble();
        length = input.nextDouble();

        area = Math.pow(radius, 2) * PI;

        volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }

}
