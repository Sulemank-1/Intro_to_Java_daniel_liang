package A06_Methods.Exercises;

import java.util.Scanner;

public class Exercise06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter a character to count: ");
        char ch = input.next().charAt(0);

        System.out.println(count(str, ch));

        input.close();
    }

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a)
                count++;
        }

        return count;

    }
}
