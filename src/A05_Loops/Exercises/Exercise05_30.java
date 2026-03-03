package A05_Loops.Exercises;

import java.util.Scanner;

public class Exercise05_30 {
    public static void main(String[] args) {

    }

    public static void compoundValue(){
        /*(Financial application: compound value) Suppose you save $100 each month into a savings account with the annual interest rate 5%. Thus, the monthly interest rate is 0.05 / 12 = 0.00417. After the first month, the value in the account becomes

             100 * (1 + 0.00417) = 100.417

        After the second month, the value in the account becomes

            (100 + 100.417) * (1 + 0.00417) = 201.252

        After the third month, the value in the account becomes

            (100 + 201.252) * (1 + 0.00417) = 302.507*/

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of months: ");
        int months = input.nextInt();

        double interestRate = annualInterestRate / 1200;
        double savingsAmount = 0.0;

        for (int i = 1; i<=months; i++){
            savingsAmount = (savingsAmount + amount) * (1 + interestRate);
        }

        System.out.println(savingsAmount);
    }

}
