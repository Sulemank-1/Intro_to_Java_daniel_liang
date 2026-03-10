package A02_Elementary_Programming.Exercises;

import java.util.Scanner;

public class Exercise02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200.0;

        double futureInvestmentValue = investmentAmount * Math.pow((1+monthlyInterestRate), years * 12);

        System.out.println("Future value is " + futureInvestmentValue);
    }

}
