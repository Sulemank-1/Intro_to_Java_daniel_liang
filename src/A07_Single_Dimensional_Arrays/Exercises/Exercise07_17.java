package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of student: ");
        int numberOfStudents = input.nextInt();

        String[] names  = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];


        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Enter student %d name: ", i + 1);
            names[i] = input.next();
            System.out.print("Enter score: ");
            scores[i] = input.nextInt();
        }

        sortStudents(scores, names);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Name: " + names[i] + "  Score: " + scores[i]);
        }

    }

    public static void sortStudents(int[] scores, String[] names){

        for (int i=0; i<scores.length-1; i++){
            int currentMax = scores[i];
            int currentMaxIndex = i;

            for (int j = i+1; j<scores.length; j++){
                if (currentMax < scores[j]){
                    currentMax = scores[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i){
                scores[currentMaxIndex] = scores[i];
                scores[i] = currentMax;

                String temp = names[currentMaxIndex];
                names[currentMaxIndex] = names[i];
                names[i] = temp;
            }
        }
    }
}
