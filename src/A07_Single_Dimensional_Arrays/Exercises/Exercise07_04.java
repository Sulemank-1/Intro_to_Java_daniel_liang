package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[100];
        int n = 0;
        int sum = 0;
        System.out.print("Enter scores(-ve number to end input): ");
        int num = 0;
        for (int i = 0; i < 100; i++){
            num = input.nextInt();
            if (num < 0)
                break;
            scores[i] = num;
            sum += num;
            n++;
        }

        double average = 0.0;

        if (n > 0)
            average = (double) sum / n;


        int aboveOrEqual = 0;
        int below = 0;

        for (int j = 0; j < n; j++){
            if (scores[j] >= average)
                aboveOrEqual++;
            else
                below++;
        }

        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
        System.out.println("Scores above or equal " + aboveOrEqual);
        System.out.println("Scores below " + below);
    }
}
