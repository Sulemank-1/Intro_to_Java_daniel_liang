package A02_Elementary_Programming;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        // Displays the sales tax with two digits after the decimal point

        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;

        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
    }


}
