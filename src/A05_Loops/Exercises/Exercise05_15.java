package A05_Loops.Exercises;

public class Exercise05_15 {
    public static void main(String[] args) {

    }

    public static void asciiTable(){
        /*(Display the ASCII character table) Write a program that prints the characters in the ASCII character table from ! to ~. Display 10 characters per line.*/

        int counter = 0;

        for (char i = '!'; i <= '~'; i++) {
            counter++;
            if (counter % 10 == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }

        }

    }

}
