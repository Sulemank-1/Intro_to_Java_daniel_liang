package A02_Elementary_Programming.Exercises;

import java.util.Scanner;

public class Exercise02_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int offset;

        System.out.print("Enter the time zone offset to GMT: ");
        offset = input.nextInt();


        long totalMillieSeconds = System.currentTimeMillis();

        long totalSeconds = totalMillieSeconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        totalHours += offset;

        long currentHour = (totalHours % 24 + 24) % 24;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }


}
