package A09_Objects_And_Classes.Exercises;

import java.util.Random;

public class Exercise09_04 {
    public static void main(String[] args) {
        Random randomNumber = new java.util.Random(1000);

        for (int i = 1; i <= 50; i++) {
            if (i % 10 == 0)
                System.out.printf("%5d\n", randomNumber.nextInt(100));
            else
                System.out.printf("%5d", randomNumber.nextInt(100));
        }
    }
}
