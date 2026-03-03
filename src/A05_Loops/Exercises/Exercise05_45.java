package A05_Loops.Exercises;

import java.util.Scanner;

public class Exercise05_45 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double numbers = 0.0;
        double sum = 0.0;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++){
            numbers = input.nextDouble();
            sum+=numbers;
        }

        double mean  = sum / 10.0;



    }


}
