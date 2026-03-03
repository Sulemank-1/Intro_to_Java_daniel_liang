package A06_Methods.Exercises;

import java.util.Scanner;

public class Exercise06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        System.out.println("Sum of digits are: " + sumDigits(integer));
    }

    public static int sumDigits(long n){
        int sum = 0;

        while(n > 0){
            sum += (n%10);
            n /=10;
        }

        return sum;
    }
}
