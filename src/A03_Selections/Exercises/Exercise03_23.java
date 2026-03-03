package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_23 {
    public static void pointInARectangle23(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        if (x2 <= 10/2 && y2 <= 5.0/2)
            System.out.println("Point (" + x2 + ", " + y2 + ") is in the rectangle.");
        else
            System.out.println("Point (" + x2 + ", " + y2 + ") is not in the rectangle.");


    }

}
