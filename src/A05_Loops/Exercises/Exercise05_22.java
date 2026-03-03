package A05_Loops.Exercises;

public class Exercise05_22 {
    public static void main(String[] args) {

    }

    public static void loanAmortizationSchedule(){
        /*(Financial application: loan amortization schedule) The monthly payment for a given loan pays the principal
         and the interest. The monthly interest is computed by multiplying the monthly interest rate and the balance (the remaining principal). The principal paid for the month is therefore the monthly payment minus the monthly interest. Write a program that lets the user enter the loan amount, number of years, and interest rate then displays the amortization schedule for the loan.*/

        double loanAmount = 10000;
        int years = 1;
        double interest = 7.0;
        int totalMonths = years * 12;
        double interestRate = interest / 100.0;
        double monthlyInterestRate = interestRate / 12;

        double monthlyPayment =
                (loanAmount * monthlyInterestRate * Math.pow(1+monthlyInterestRate, totalMonths) )/ (Math.pow(1+monthlyInterestRate, totalMonths) - 1);
        double totalPayment = monthlyPayment * totalMonths;

        double balance = loanAmount;


        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Number of Years: " + years);
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);

        System.out.printf("\n%-15s%-15s%-15s%-15s\n","Payment#", "Interest", "Principal", "Balance");

        for (int month = 1; month <= totalMonths; month++){
            double interestPaid = monthlyInterestRate * balance;
            double principal = monthlyPayment - interestPaid;
            balance -= principal;
            System.out.printf("%-15d%-15.2f%-15.2f%-15.2f\n", month, interestPaid, principal, balance);

        }
    }

}
