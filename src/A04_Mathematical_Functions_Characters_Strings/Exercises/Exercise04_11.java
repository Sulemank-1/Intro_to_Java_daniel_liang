package A04_Mathematical_Functions_Characters_Strings.Exercises;

import java.util.Scanner;

public class Exercise04_11 {
    public static void main(String[] args) {

    }

    public static void decimalToHex(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int value = input.nextInt();

        if (value >= 0 && value < 10){
            System.out.println(value);
        } else if (value >= 10 && value <= 15) {
            char hex = (char)('A' + (value - 10));
            System.out.println(hex);
        }else
            System.out.printf("%s is an invalid input", value);
    }

}
