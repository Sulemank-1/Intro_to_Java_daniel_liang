package A07_Single_Dimensional_Arrays.Exercises;
import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        int[] scores = new int[n];

        System.out.printf("Enter %d scores: ", n);
        for (int i=0; i<n; i++)
            scores[i] = input.nextInt();

        int bestScore = getBestScore(scores);

        for (int i = 0; i < n; i++)
            System.out.printf("Student %d score is %d and grade is %s\n", i, scores[i], getGrades(scores[i], bestScore));
    }

    public static int getBestScore(int[] scores){
        int bestScore = scores[0];
        for (int i = 1; i<scores.length; i++){
            if (bestScore < scores[i])
                bestScore = scores[i];
        }

        return bestScore;
    }

    public static String getGrades(int score, int bestScore){
        if (score >= bestScore-10)
            return "A";
        else if (score >= bestScore-20)
            return "B";
        else if (score >= bestScore-30)
            return "C";
        else if (score >= bestScore-40)
            return "D";
        else
            return "F";
    }


}
