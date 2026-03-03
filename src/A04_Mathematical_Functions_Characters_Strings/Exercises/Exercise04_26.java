package A04_Mathematical_Functions_Characters_Strings.Exercises;

import java.util.Scanner;

public class Exercise04_26 {
    public static void main(String[] args) {

    }

    public static void computeChange(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        String amount = input.nextLine();

        int numberOfOneDollars = Integer.parseInt(amount.substring(0, amount.indexOf(".")));
        int remainingAmount = Integer.parseInt(amount.substring(amount.indexOf(".")+ 1));


        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.printf("Your amount %s consists of\n", amount);
        System.out.printf("%d dollars\n", numberOfOneDollars);
        System.out.printf("%d quarters\n", numberOfQuarters);
        System.out.printf("%d dimes\n", numberOfDimes);
        System.out.printf("%d nickels\n", numberOfNickels);
        System.out.printf("%d pennies", numberOfPennies);
    }

}
