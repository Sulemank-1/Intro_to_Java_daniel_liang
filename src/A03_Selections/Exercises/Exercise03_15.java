package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_15 {
    public static void main(String[] args) {

    }

    public static void lottery15(){
        int lottery = (int)(100 + Math.random() * (1000 - 100));

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        int originalLottery = lottery;
        int originalGuess = guess;


        int l3 = lottery % 10;
        lottery = lottery / 10;
        int l2 = lottery % 10;
        int l1 = lottery / 10;



        int g3 = guess % 10;
        guess = guess / 10;
        int g2 = guess % 10;
        int g1 = guess / 10;



        if (originalGuess == originalLottery)
            System.out.println("Exact match: you win $10,000");
        else if ((l1 == g1 || l1 == g2 || l1 == g3) &&
                (l2 == g1 || l2 == g2 || l2 == g3) &&
                (l3 == g1 || l3 == g2 || l3 == g3))
            System.out.println("Match all digits: you win $3,000");
        else if ((l1 == g1 || l1 == g2 || l1 == g3) ||
                (l2 == g1 || l2 == g2 || l2 == g3) ||
                (l3 == g1 || l3 == g2 || l3 == g3))
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }

}
