package A05_Loops.Exercises;

import java.util.Scanner;

public class Exercise05_01 {
    public static void main(String[] args) {

    }

    public static void e1(){
        /* (Count positive and negative number and compute the average of number) Write a program that reads an unspecified number of integers, determines how many positive and negative values have been read, and computes the total and average of the input values (not counting zeros). Your program ends with the input 0*/

        Scanner input = new Scanner(System.in);
        int positives = 0, negatives = 0, count = 0;
        double total = 0.0, average = 0.0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        while (number != 0) {
            if (number > 0)
                positives++;
            else
                negatives++;
            total += number;
            count++;
            number = input.nextInt();
        }

        average = total / count;

        System.out.println("The number of positives is " + positives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);

    }

}
