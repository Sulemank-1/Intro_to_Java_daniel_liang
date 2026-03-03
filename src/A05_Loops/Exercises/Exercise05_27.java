package A05_Loops.Exercises;

public class Exercise05_27 {
    public static void main(String[] args) {

    }

    public static void leapYear(){
        /*(Display leap years) Write a program that displays all the leap years, 10 per line, from 101 to 2100, separated by exactly one space. Also display the number of leap years in this period.*/

        int counter = 0;
        for (int year = 101; year <= 2100; year++){
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

            if (isLeapYear){
                System.out.print(year + " ");
                counter++;

                if (counter % 10 == 0)
                    System.out.println();

            }
        }
    }

}
