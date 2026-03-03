package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_22 {
    public static void pointInACircle22(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x1 = 0, y1 = 0;

        double distance = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        distance = Math.pow(distance, 0.5);

        if (distance <= 10)
            System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle");
        else
            System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle");
    }

}
