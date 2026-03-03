package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_14 {
    public static void main(String[] args) {

    }

    public static void headOrTails14(){
        Scanner input = new Scanner(System.in);

        int coin = (int) (Math.random() * 2);

        System.out.print("Enter your guess, 1 for heads 0 for tails: ");
        int guess = input.nextInt();

        if (coin == guess)
            System.out.println("Correct guess");
        else
            System.out.println("Wrong guess");
    }

}
