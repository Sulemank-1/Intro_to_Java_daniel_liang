package A06_Methods.Exercises;

import java.util.Scanner;

public class Exercise06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        reverse(number);
    }

    public static void reverse(int number){
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        System.out.println(reversedNumber);
    }
}
