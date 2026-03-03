package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double disc = (b * b) - (4 * a * c);


        if (disc > 0){
            double r1 = (-b + Math.pow(disc, 0.5)) / 2 * a;
            double r2 = (-b - Math.pow(disc, 0.5)) / 2 * a;
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }else if (disc == 0){
            double r1 = (-b + Math.pow(disc, 0.5)) / 2 * a;
            System.out.println("The equation has one root " + r1);
        }else
            System.out.println("The equation has no real roots");


    }
}
