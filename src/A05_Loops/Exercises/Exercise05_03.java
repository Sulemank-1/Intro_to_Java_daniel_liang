package A05_Loops.Exercises;

public class Exercise05_03 {
    public static void main(String[] args) {

    }

    public static void kilogramsToPounds(){
        System.out.printf("%-10s%-10s\n", "Kilograms", "Pounds");


        double pounds = 2.2;
        int totalKilograms = 10;

        for (int kilograms = 1; kilograms <= totalKilograms; kilograms+=2){
            System.out.printf("%-10d%-10.1f\n", kilograms, pounds * kilograms);
        }
    }

}
