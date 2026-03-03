package A05_Loops.Exercises;

import java.util.Scanner;

public class Exercise05_28 {
    public static void main(String[] args) {

    }

    public static void firstDaysOfMonths(){
        /* (Display the first days of each month) Write a program that prompts the user to enter the year and first day of the year, then displays the first day of each month in the year. For example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013, your program should display the following output:

        January 1, 2013 is Tuesday
        ...
        December 1, 2013 is Sunday*/

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first day (0-6): ");
        int firstDay = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();


        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        for (int month = 1; month<=12; month++){
            int daysInMonth = 0;
            String monthName = "";

            switch (month){
                case 1: monthName = "January"; daysInMonth = 31; break;
                case 2: monthName = "February"; daysInMonth = isLeapYear ? 29 : 28; break;
                case 3: monthName = "March"; daysInMonth = 31; break;
                case 4: monthName = "April"; daysInMonth = 30; break;
                case 5: monthName = "May"; daysInMonth = 31; break;
                case 6: monthName = "June"; daysInMonth = 30; break;
                case 7: monthName = "July"; daysInMonth = 31; break;
                case 8: monthName = "August"; daysInMonth = 31; break;
                case 9: monthName = "September"; daysInMonth = 30; break;
                case 10: monthName = "October"; daysInMonth = 31; break;
                case 11: monthName = "November"; daysInMonth = 30; break;
                case 12: monthName = "December"; daysInMonth = 31; break;
            }



            String dayName = "";
            switch (firstDay){
                case 0: dayName = "Sunday"; break;
                case 1: dayName = "Monday"; break;
                case 2: dayName = "Tuesday"; break;
                case 3: dayName = "Wednesday"; break;
                case 4: dayName = "Thursday"; break;
                case 5: dayName = "Friday"; break;
                case 6: dayName = "Saturday"; break;
            }



            System.out.printf("%s 1, %d is %s\n", monthName, year, dayName);


            firstDay = (daysInMonth + firstDay) % 7;
        }
    }

}
