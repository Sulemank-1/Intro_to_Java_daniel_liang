package A06_Methods.Exercises;

import java.util.Scanner;

public class Exercise06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int number = input.nextInt();

        if (isPalindrome(number))
            System.out.printf("%d is a Palindrome", number);
        else
            System.out.printf("%d is not a Palindrome", number);

    }

    public static int reverse(int number){
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        return reversedNumber;
    }

    public static boolean isPalindrome(int number){
        return reverse(number) == number;
    }
}
