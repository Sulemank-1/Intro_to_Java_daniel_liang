package A09_Objects_And_Classes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("The elapsed time since Jan 1, 1970 is " + date.getTime() + " milliseconds");
        System.out.println(date.toString() );

        Random generator1 = new Random(3);
        System.out.print("From generator1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(generator1.nextInt(1000) + " ");

        Random generator2 = new Random(3);
        System.out.print("\nFrom generator2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(generator2.nextInt(1000) + " ");


    }
}
