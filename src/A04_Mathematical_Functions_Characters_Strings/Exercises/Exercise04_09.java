package A04_Mathematical_Functions_Characters_Strings.Exercises;

import java.util.Scanner;

public class Exercise04_09 {
    public static void main(String[] args) {

    }

    public static void characterToASCII8(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter character: ");
        String ascii = input.nextLine();

        char a = ascii.charAt(0);

        System.out.println((int)a);


    }

}
