package A09_Objects_And_Classes.Exercises;

import java.util.Date;

public class Exercise09_03 {
    public static void main(String[] args) {
        Date date = new Date();

        date.setTime(10000);

        System.out.println(date.toString());
    }
}
