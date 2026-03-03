package A03_Selections;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 100);
        int number4 = (int)(Math.random() * 100);

        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("What is " + number1 + " − " + number2 + "? ");
        int answer = input.nextInt();

        if (number1 - number2 == answer){
            System.out.println("You are correct!");
        }
        else{
            System.out.println("Your answer in wrong.");
            System.out.println(number1 + " − " + number2 + " should be " + (number1 - number2));
        }

        System.out.print("What is " + number3 + " + " + number4 + "? ");
        int answer2 = input.nextInt();

        if (number3 + number4 == answer2){
            System.out.println("You are correct!");
        }
        else{
            System.out.println("Your answer in wrong.");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
        }


    }
}
