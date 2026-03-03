package A05_Loops.Exercises;

public class Exercise05_07 {
    public static void main(String[] args) {

    }
    public static void futureTuition(){
        /*(Financial application: compute future tuition) Suppose the tuition for a university is $10,000 this year and increases 5% every year. In one year, the tuition will be $10,500. Write a program that displays the tuition in 10 years, and the total cost of four years’ worth of tuition after the tenth year.*/
        double tuition = 10000;
        double total = 0.0;
        double tenYearTuition = 0.0;
        double fourYearTuition = 0.0;

        for(int year = 1; year <= 14; year++){
            tuition = tuition * 1.05;

            if (year == 10)
                tenYearTuition = tuition;

            if (year > 10){
                fourYearTuition += tuition;
            }
        }

        total = tuition * 4;

        System.out.printf("Tution in 10 years %.2f\n", tenYearTuition);
        System.out.printf("Total tuition for 4 years after 10th year %.2f", fourYearTuition);



    }

}
