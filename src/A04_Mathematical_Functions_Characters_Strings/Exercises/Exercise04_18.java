package A04_Mathematical_Functions_Characters_Strings.Exercises;

import java.util.Scanner;

public class Exercise04_18 {
    public static void main(String[] args) {

    }

    public static void studentMajorStatus(){
        Scanner input = new Scanner(System.in);
        String major = "", status = "";

        System.out.print("Enter two characters: ");
        String majorAndStatus = input.nextLine();

        String msChars = majorAndStatus.substring(0,2);

        switch (Character.toUpperCase(msChars.charAt(0))){
            case 'M': major = "Mathematics"; break;
            case 'C': major = "Computer Science"; break;
            case 'I': major = "Information Technology"; break;
            default:
                System.out.println("Invalid Input");
                System.exit(0);
        }

        switch (msChars.charAt(1)){
            case '1': status = "Freshman"; break;
            case '2': status = "Sophomore"; break;
            case '3': status = "Junior"; break;
            case '4': status = "Senior"; break;
        }

        System.out.printf("%s %s", major, status);



    }

}
