package A04_Mathematical_Functions_Characters_Strings.Exercises;

import java.util.Scanner;

public class Exercise04_23 {
    public static void main(String[] args) {

    }

    public static void payroll(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee’s name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double fTaxRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double sTaxRate = input.nextDouble();

        double grossPay = hoursWorked * hourlyRate;
        double fTax = grossPay * fTaxRate;
        double sTax = grossPay * sTaxRate;
        double totalDeduction = fTax + sTax;
        double netPay = grossPay - totalDeduction;

        System.out.printf("Employee Name: %s\n", name);
        System.out.printf("Hours Worked: %.1f\n", hoursWorked);
        System.out.printf("Pay Rate: $%.2f\n", hourlyRate);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.println("Deductions: ");
        System.out.printf("\tFederal Withholding (%.1f%%): $%.2f\n",fTaxRate*100, fTax);
        System.out.printf("\tState Withholding (%.1f%%): $%.2f\n",sTaxRate*100, sTax);
        System.out.printf("\tTotal Deduction : $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: %.2f", netPay);


    }

}
