package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_16 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        ArrayList<Integer> answers = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer){
            if (answers.contains(answer))
                System.out.println("You already entered" + answer);
            else{
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
                answers.add(answer);
            }
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }

}
