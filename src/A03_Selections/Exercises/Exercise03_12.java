package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        if (number < 0)
            number *= -1;

        int digit1 = number / 100;
        int digit3 = number % 10;

        String answer = (digit1 == digit3) ? " is a palindrome" : " is not a palindrome";

        System.out.println( number + answer);
    }


}
