package A06_Methods.Exercises;

import java.util.Scanner;

public class Exercise06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter milliseconds: ");
        long milliseconds = input.nextLong();

        System.out.println(convertMillis(milliseconds));
    }

    public static String convertMillis(long millis){

        long totalSeconds = millis / 1000;

        long remainingSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long remainingMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        return "Current time is " + totalHours + ":" + remainingMinutes + ":" + remainingSeconds;
    }
}
