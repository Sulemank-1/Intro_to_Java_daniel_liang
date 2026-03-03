package A04_Mathematical_Functions_Characters_Strings.Exercises;

import java.util.Scanner;

public class Exercise04_22 {
    public static void main(String[] args) {

    }

    public static void checkSubstring(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();

        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();

        if (s1.contains(s2))
            System.out.printf("%s is a substring of %s", s2, s1);
        else
            System.out.printf("%s is not a substring of %s", s2, s1);


    }

}
