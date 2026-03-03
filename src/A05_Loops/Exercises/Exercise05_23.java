package A05_Loops.Exercises;

public class Exercise05_23 {
    public static void main(String[] args) {

    }

    public static void cancellationErrors(){
        /*(Demonstrate cancellation errors) A cancellation error occurs when you are manipulating a very large number with a very small number. The large number may cancel out the smaller number. For example, the result of 100000000.0 + 0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain more accurate results, carefully select the order of computation. For example, in computing the following summation, you will obtain more accurate results by computing from right to left rather than from left to right:*/

        double sum1 = 1.0;
        double sum2 = 1.0;
        double n = 50000.0;
        for (double i = 2.0; i <= n; i++){
            sum1 = sum1 + (1.0/i);
        }

        System.out.println("Summation left to right: " + sum1);

        for (double i = n; i >= 2.0; i--){
            sum2 = sum2 + (1.0/i);
        }

        System.out.println("Summation right to left: " + sum2);
    }

}
