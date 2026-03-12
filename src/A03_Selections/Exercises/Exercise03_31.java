package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double currencyAmount = 0.0;

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int choice = input.nextInt();

        switch (choice){
            case 0: {
                System.out.print("Enter the dollar amount: ");
                double amount = input.nextDouble();
                currencyAmount = amount * exchangeRate;
                System.out.println( "$" + amount + " is " + currencyAmount + " yuan");
                break;
            }

            case 1: {
                System.out.print("Enter the RMB amount: ");
                double amount = input.nextDouble();
                currencyAmount = amount / exchangeRate;
                System.out.println(amount + " yuan is $" + currencyAmount);
                break;
            }
        }
    }

}
