package A04_Mathematical_Functions_Characters_Strings.Exercises;

import java.util.Scanner;

public class Exercise04_24 {
    public static void main(String[] args) {

    }

    public static void orderThreeCities(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String c1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String c2 = input.nextLine();

        System.out.print("Enter the third city: ");
        String c3 = input.nextLine();

        if(c1.compareTo(c2) > 0){
            String temp = c1;
            c1 = c2;
            c2 = temp;
        }

        if(c1.compareTo(c3) > 0){
            String temp = c1;
            c1 = c3;
            c3 = temp;
        }

        if(c2.compareTo(c3) > 0){
            String temp = c2;
            c2 = c3;
            c3 = temp;
        }

        System.out.printf("The three cities in alphabetical order are %s %s %s", c1, c2, c3);


    }

}
