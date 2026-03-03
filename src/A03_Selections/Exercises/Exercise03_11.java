package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_11 {
    public static void main(String[] args) {

    }

    public static void numberOfDaysInMonth11(){
        Scanner input = new Scanner(System.in);
        String whichMonth = "";
        int days = 0;
        System.out.print("Enter the month and year: ");
        int month = input.nextInt();
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month){
            case 1: {
                whichMonth = "January";
                days = 31;
            } break;
            case 2: {
                whichMonth = "February";
                days = (isLeapYear) ? 29 : 28;
            } break;
            case 3: {
                whichMonth = "March";
                days = 31;
            } break;
            case 4: {
                whichMonth = "April";
                days = 30;
            } break;
            case 5: {
                whichMonth = "May";
                days = 31;
            } break;
            case 6: {
                whichMonth = "June";
                days = 30;
            } break;
            case 7: {
                whichMonth = "July";
                days = 31;
            } break;
            case 8: {
                whichMonth = "August";
                days = 31;
            } break;
            case 9: {
                whichMonth = "September";
                days = 30;
            } break;
            case 10: {
                whichMonth = "October";
                days = 31;
            } break;
            case 11: {
                whichMonth = "November";
                days = 30;
            } break;
            case 12: {
                whichMonth = "December";
                days = 31;
            } break;
            default: {
                System.out.println("Error: Invalid month number. Please enter a number between 1 and 12.");
                return;
            }
        }

        System.out.println(whichMonth + " " + year + " has " + days + " days");
    }

}
