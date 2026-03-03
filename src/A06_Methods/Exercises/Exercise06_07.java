package A06_Methods.Exercises;

import java.util.Scanner;

public class Exercise06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200.0;

        System.out.printf("%-10s%-15s\n", "Years", "Future Value");

        for (int i=1; i<=years; i++)
            System.out.printf("%-10d%-15.2f\n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));

    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * Math.pow((1+monthlyInterestRate), years * 12);
    }
}
