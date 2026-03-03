package A04_Mathematical_Functions_Characters_Strings.Exercises;

import java.util.Scanner;

public class Exercise04_01 {
    public static void main(String[] args) {

    }

    public static void areaOfPentagon(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        double s = 2 * r * Math.sin(Math.PI / 5.0);

        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5.0));

        System.out.printf("The area of the pentagon is %.2f" , area);


    }

}
