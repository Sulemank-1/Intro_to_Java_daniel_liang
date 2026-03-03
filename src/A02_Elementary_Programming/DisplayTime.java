package A02_Elementary_Programming;

import java.util.Scanner;

public class DisplayTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int remainingMinutes = seconds % 60;

        System.out.println(minutes + " minutes and " + remainingMinutes + " seconds");
    }
}
