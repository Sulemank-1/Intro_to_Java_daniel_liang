package A04_Mathematical_Functions_Characters_Strings.Exercises;

import java.util.Scanner;

public class Exercise04_14 {
    public static void main(String[] args) {

    }

    public static void gradeToNumber(){
        Scanner input = new Scanner(System.in);
        int value = 0;
        System.out.print("Enter a letter grade: ");
        String letter = input.nextLine();
        char ltr = letter.charAt(0);
        char capLtr = Character.toUpperCase(ltr);

        if ((capLtr >= 'A' && capLtr <= 'D') || capLtr == 'F'){
            switch (capLtr){
                case 'A': value = 4; break;
                case 'B': value = 3; break;
                case 'C': value = 2; break;
                case 'D': value = 1; break;
            }
            System.out.printf("The numeric value for grade %s is %d", ltr, value);
        }else
            System.out.printf("%s is an invalid grade", ltr);



    }

}
