package A05_Loops.Exercises;

import java.util.Scanner;

public class Exercise05_08 {
    public static void main(String[] args) {

    }
    public static void highestScore(){
        /*(Find the highest score) Write a program that prompts the user to enter the number of students and each student’s name and score, and finally displays the name of the student with the highest score. Use the next() method in the Scanner class to read a name, rather than using the nextLine() method.*/

        Scanner input = new Scanner(System.in);
        int highestScore = 0;
        String name = "";

        System.out.print("Enter number of students: ");
        int numOfStu = input.nextInt();

        for (int i = 1; i <= numOfStu; i++){
            System.out.print("Enter student name: ");
            String sName = input.next();

            System.out.print("Enter student score: ");
            int sScore = input.nextInt();

            if (highestScore < sScore){
                highestScore = sScore;
                name = sName;
            }
        }

        System.out.println("\nStudent name is " + name);
        System.out.println("Student score is " + highestScore);

    }

}
