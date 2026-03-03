package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_18 {
    public static void costOfShipping18(){
        Scanner input = new Scanner(System.in);
        double shipping = 0.0;

        System.out.print("Enter weight of package(pounds): ");
        double weight = input.nextDouble();

        if (weight <= 0)
            System.out.println("Invalid input.");
        else if (weight > 20)
            System.out.println("The package cannot be shipped.");
        else {
            if (weight <= 1)
                shipping = weight * 3.5;
            else if (weight <= 3)
                shipping = weight * 5.5;
            else if (weight <= 10)
                shipping = weight * 8.5;
            else if (weight <= 20)
                shipping = weight * 10.5;

            System.out.print("Shipping cost: " + shipping);
        }

    }

}
