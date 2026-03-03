package A05_Loops.Exercises;

public class Exercise05_24 {
    public static void main(String[] args) {

    }

    public static void sumSeries(){
        double i = 97.0;
        double j = 99.0;
        double sum = 0.0;

        while (i > 0.0 && j > 1.0){
            sum += (i/j);
            i-=2;
            j-=2;
        }

        System.out.println(sum);
    }

}
