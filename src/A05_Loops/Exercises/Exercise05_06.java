package A05_Loops.Exercises;

public class Exercise05_06 {
    public static void main(String[] args) {

    }

    public static void e6(){

        /*(Conversion from miles to kilometers) Write a program that displays the following two tables side by side:*/
        System.out.printf("%-10s%-15s%-15s%-10s\n","Miles","Kilometers","Kilometers","Miles");

        int miles = 1;
        int totalMiles = 10;

        int kilometers = 20;
        int totalKilometers = 65;

        double milesToKilometers = 1.609;


        while(miles <= totalMiles && kilometers <= totalKilometers){
            System.out.printf("%-10d%-15.3f", miles, milesToKilometers * miles);
            System.out.printf("%-15d%-10.3f\n", kilometers, kilometers / milesToKilometers);

            miles++;
            kilometers+=5;

        }

    }

}
