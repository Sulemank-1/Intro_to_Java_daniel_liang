package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today’s day: ");
        int todayDate = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDayDate = input.nextInt();

        String today = "";
        String elapsedDay = "";

        switch (todayDate){
            case 0:
                today = "Sunday" ; break;
            case 1:
                today = "Monday"; break;
            case 2:
                today = "Tuesday"; break;
            case 3:
                today = "Wednesday"; break;
            case 4:
                today = "Thursday"; break;
            case 5:
                today = "Friday"; break;
            case 6:
                today = "Saturday"; break;
        }

        switch ((todayDate + elapsedDayDate) % 7){
            case 0:
                elapsedDay = "Sunday" ; break;
            case 1:
                elapsedDay = "Monday"; break;
            case 2:
                elapsedDay = "Tuesday"; break;
            case 3:
                elapsedDay = "Wednesday"; break;
            case 4:
                elapsedDay = "Thursday"; break;
            case 5:
                elapsedDay = "Friday"; break;
            case 6:
                elapsedDay = "Saturday"; break;
        }

        System.out.println("Today is " +  today + " and the future day is " + elapsedDay);

    }
}




