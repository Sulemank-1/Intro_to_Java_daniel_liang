package A05_Loops.Exercises;

public class Exercise05_05 {
    public static void main(String[] args) {

    }

    public static void e5(){
        /*(Conversion from kilograms to pounds and pounds to kilograms) Write a program that displays the following two tables side by side:*/
        System.out.printf("%-15s%-10s%-10s%-10s\n","Kilograms","Pounds","Pounds","Kilograms");

        int kg = 1;
        int totalKilograms = 199;

        int pounds = 20;
        int totalPounds = 515;

        double KgToPounds = 2.2;


        while(kg <= totalKilograms && pounds <= totalPounds){
            System.out.printf("%-15d%-10.1f", kg, KgToPounds * kg);
            System.out.printf("%-10d%-10.2f\n", pounds, pounds / KgToPounds);

            kg +=2;
            pounds+=5;

        }
    }

}
