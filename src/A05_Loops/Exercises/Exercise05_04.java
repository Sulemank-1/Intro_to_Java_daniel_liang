package A05_Loops.Exercises;

public class Exercise05_04 {
    public static void main(String[] args) {

    }

    public static void milesToKilometers(){
        System.out.printf("%-10s%-10s\n", "Miles", "Kilometers");


        double kilometers = 1.609;
        int totalMiles = 10;

        for (int  miles = 1; miles <= totalMiles; miles++){
            System.out.printf("%-10d%-10.3f\n", miles, kilometers * miles);
        }
    }

}
