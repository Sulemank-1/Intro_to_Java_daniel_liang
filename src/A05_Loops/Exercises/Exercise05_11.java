package A05_Loops.Exercises;

public class Exercise05_11 {
    public static void main(String[] args) {

    }

    public static void divisibleBy(){
        /*(Find numbers divisible by 5 or 6, but not both) Write a program that displays all the numbers from 100 to 200 (10 per line) that are divisible by 5 or 6, but not both. Numbers are separated by exactly one space.*/

        int count = 0;

        for (int numbers = 100; numbers<=1000; numbers++){
            if (numbers % 5 == 0 ^ numbers % 6 == 0){
                System.out.print(numbers + " ");
                count++;

                if (count % 10 == 0)
                    System.out.println();
            }
        }
    }

}
