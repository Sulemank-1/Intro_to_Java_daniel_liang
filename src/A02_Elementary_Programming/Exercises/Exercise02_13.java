package A02_Elementary_Programming.Exercises;

import java.util.Scanner;

public class Exercise02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount;
        double monthlyInterestRate = 0.05 / 12;

        System.out.print("Enter the monthly savings amount: ");
        amount = input.nextDouble();

        double month1 = amount * (1 + monthlyInterestRate);
        double month2 = (amount + month1) * (1 + monthlyInterestRate);
        double month3 = (amount + month2) * (1 + monthlyInterestRate);
        double month4 = (amount + month3) * (1 + monthlyInterestRate);
        double month5 = (amount + month4) * (1 + monthlyInterestRate);
        double month6 = (amount + month5) * (1 + monthlyInterestRate);

        System.out.println("After the sixth month, the account value is " + month6);
    }


}
