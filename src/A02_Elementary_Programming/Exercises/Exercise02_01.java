package A02_Elementary_Programming.Exercises;

import java.util.Scanner;

public class Exercise02_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.print("Enter degree in Celsius:");
        celsius = input.nextDouble();

        fahrenheit = (9.0/5) * celsius + 32;

        System.out.print(celsius + " celsius is " + fahrenheit + " fahrenheit");

    }

}
