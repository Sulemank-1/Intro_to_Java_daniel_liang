package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_17 {
    public static void rockPaperScissors17(){
        Scanner input = new Scanner(System.in);

        int computerGuess = (int)(Math.random() * 3);
        String result = "";
        String computer = "";
        String user = "";

        System.out.print("scissor (0), rock (1), paper (2): ");
        int userGuess = input.nextInt();;

        if (computerGuess == 0 && userGuess == 1)
            result = "User wins";
        else if(computerGuess == 0 && userGuess == 2)
            result = "Computer wins";
        else if (computerGuess == 1 && userGuess == 0)
            result = "Computer wins";
        else if (computerGuess == 1 && userGuess == 2)
            result = "User wins";
        else if (computerGuess == 2 && userGuess == 0)
            result = "User wins";
        else if (computerGuess == 2 && userGuess == 1)
            result = "Computer wins";
        else
            result = "Draw";

        switch (computerGuess){
            case 0: computer = "scissors"; break;
            case 1: computer = "rock"; break;
            case 2: computer = "paper"; break;
        }

        switch (userGuess){
            case 0: user = "scissors"; break;
            case 1: user = "rock"; break;
            case 2: user = "paper"; break;
        }


        System.out.println("The computer is " + computer + "." + " You are " + user + ". " + result);
    }

}
