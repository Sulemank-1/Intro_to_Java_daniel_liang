package A02_Elementary_Programming.Exercises;

import java.util.Scanner;

public class Exercise02_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        double annualInterestRate;
        double interest;

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        balance = input.nextDouble();
        annualInterestRate = input.nextDouble();

        interest = balance * (annualInterestRate/1200);

        System.out.println("The interest is " + interest);
    }


}
