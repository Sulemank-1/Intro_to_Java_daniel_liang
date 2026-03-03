package A05_Loops.Exercises;

public class Exercise05_10 {
    public static void main(String[] args) {

    }

    public static void divisibleBy(){
        /*(Find numbers divisible by 5 and 6) Write a program that displays all the numbers from 100 to 1,000 (10 per line) that are divisible by 5 and 6. Numbers are separated by exactly one space.*/

        int count = 0;

        for (int numbers = 100; numbers<=1000; numbers++){
            if (numbers % 5 == 0 || numbers % 6 == 0){
                System.out.print(numbers + " ");
                count++;

                if (count % 10 == 0)
                    System.out.println();
            }
        }
    }

}
