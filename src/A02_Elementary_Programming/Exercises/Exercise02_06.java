package A02_Elementary_Programming.Exercises;

import java.util.Scanner;

public class Exercise02_06 {
    public static void main(String[] args) {

    }
    public static void sumDigitsInInteger(){
        Scanner input = new Scanner(System.in);
        int integer;
        int sum;

        System.out.print("Enter a number between 0 and 1000: ");
        integer = input.nextInt();

        sum = integer % 10;
        integer /= 10;

        sum += integer % 10;
        integer /= 10;

        sum += integer % 10;


        System.out.println("The sum of the digits is " + sum);

    }

}
