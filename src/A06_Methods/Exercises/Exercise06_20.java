package A06_Methods.Exercises;

import java.util.Scanner;

public class Exercise06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.println("Number of letters in " + str + " are " + countLetters(str));
    }

    public static int countLetters(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i)))
                count++;
        }

        return count;
    }
}
