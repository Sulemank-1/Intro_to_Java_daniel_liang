package A02_Elementary_Programming.Exercises;

import java.util.Scanner;

public class Exercise02_09 {
    public static void main(String[] args) {

    }

    public static void averageAcceleration(){
        Scanner input = new Scanner(System.in);
        double initialVelocity;
        double finalVelocity;
        double time;
        double averageAcceleration;

        System.out.print("Enter v0, v1, and t: ");
        initialVelocity = input.nextDouble();
        finalVelocity = input.nextDouble();
        time = input.nextDouble();

        averageAcceleration = (finalVelocity - initialVelocity) / time;

        System.out.println("The average acceleration is " + averageAcceleration);

    }

}
