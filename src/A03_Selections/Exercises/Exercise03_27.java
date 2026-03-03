package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_27 {
    public static void pointsInTriangle27(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Enter a point’s x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        boolean isInside = (x >= 0 && y >= 0 && (x + 2 * y <= 200));

        if (isInside)
            System.out.println("Point (" + x + ", " + y + ") is in the triangle.");
        else
            System.out.println("Point (" + x + ", " + y + ") is not in the triangle.");
    }

}
