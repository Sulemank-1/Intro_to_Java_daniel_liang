package A09_Objects_And_Classes.Exercises;

import java.util.GregorianCalendar;

public class Exercise09_05 {
    public static void main(String[] args) {
        GregorianCalendar calender = new GregorianCalendar();

        System.out.print("\nCurrent year, month, and day in format Mth/Day/Year: ");
        System.out.println(calender.get(calender.MONTH) + "/" +
                calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

        calender.setTimeInMillis(1234567898765L);

        System.out.print("\nElapsed time since January 1, 1970 set to " +
                "1234567898765L in format Mth/Day/Year: ");
        System.out.println(calender.get(calender.MONTH) + "/" +
                calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
    }
}
