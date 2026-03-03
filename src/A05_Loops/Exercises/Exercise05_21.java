package A05_Loops.Exercises;

public class Exercise05_21 {
    public static void main(String[] args) {

    }

    public static void interestPayments(){
        /*(Financial application: compare loans with various interest rates) Write a program that lets the user enter the loan amount and loan period in number of years, and displays the monthly and total payments for each interest rate starting from 5% to 8%, with an increment of 1/8*/

        double loanAmount = 10000;
        int years = 5;
        double interest = 5.0;
        int totalMonths = years * 12;


        System.out.printf("%-20s%-20s%-20s\n","Interest Rate",  "Monthly Payment",  "Total Payment");

        while (interest <= 8.0){
            double interestRate = interest / 100.0;
            double monthlyInterestRate = interestRate / 12;
            double monthlyPayment =
                    (loanAmount * monthlyInterestRate * Math.pow(1+monthlyInterestRate, totalMonths) )/ (Math.pow(1+monthlyInterestRate, totalMonths) - 1);
            double totalPayment = monthlyPayment * totalMonths;

            System.out.printf("%-20.3f%-20.2f%-20.2f\n", interest, monthlyPayment, totalPayment);

            interest += (1.0/8.0);
        }
    }

}
