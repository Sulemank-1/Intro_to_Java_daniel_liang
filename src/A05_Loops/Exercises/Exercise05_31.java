package A05_Loops.Exercises;

import java.util.Scanner;

public class Exercise05_31 {
    public static void main(String[] args) {

    }

    public static void computeCDValue() {
        /*(Financial application: compute CD value) Suppose you put $10,000 into a CD with an annual percentage yield
         of 5.75%. After one month, the CD is worth
                10000 + 10000 * 5.75 / 1200 = 10047.92

        After two months, the CD is worth
                10047.91 + 10047.91 * 5.75 / 1200 = 10096.06

        After three months, the CD is worth
                10096.06 + 10096.06 * 5.75 / 1200 = 10144.44
       */


        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double annualPercentageYield = input.nextDouble();

        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();

        double yieldRate = annualPercentageYield / 1200;
        double cdValue = amount;

        System.out.printf("\n%-8s%s\n", "Month", "CD Value");
        for (int i = 1; i <= months; i++) {
            cdValue = cdValue + cdValue * yieldRate;
            System.out.printf("%-8d%.2f\n", i, cdValue);
        }
    }

}
