package A04_Mathematical_Functions_Characters_Strings.Exercises;

import java.util.Scanner;

public class Exercise04_17 {
    public static void main(String[] args) {

    }
    public static void daysOfMonth(){
        Scanner input = new Scanner(System.in);
        int days = 0;


        System.out.print("Enter a year: ");
        int year = input.nextInt();

        input.nextLine();

        System.out.print("Enter a month: ");
        String month = input.nextLine();

        if (Character.isLowerCase(month.charAt(0))){
            System.out.printf("%s is not a correct month name", month);
        }else {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
            String monthChars = month.substring(0,3);

            switch (monthChars){
                case "Feb" : days = isLeapYear ? 29 : 28; break;
                case "Apr" :
                case "Jun" :
                case "Sep" :
                case "Nov" : days = 30; break;
                default: days = 31; break;
            }

            System.out.printf("%s %d has %d days", monthChars, year, days);
        }





    }

}
