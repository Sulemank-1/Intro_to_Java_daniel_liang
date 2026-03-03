package A02_Elementary_Programming.Exercises;

import java.util.Scanner;

public class Exercise02_05 {
    public static void main(String[] args) {

    }
    public static void calculateTips(){
        Scanner input = new Scanner(System.in);
        double subtotal;
        double gratuityRate;
        double total;
        double gratuity;

        System.out.print("Enter the subtotal and gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();


        gratuity = subtotal * (gratuityRate / 100);
        total = subtotal + gratuity;

        System.out.println("The gratuity is " + gratuity + " and total is " + total);
    }

}
