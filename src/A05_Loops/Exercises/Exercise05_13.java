package A05_Loops.Exercises;

public class Exercise05_13 {
    public static void main(String[] args) {

    }

    public static void largestN(){
        /*(Find the largest n such that n3 ) Use a while loop to find the largest integer n such that n3 is less than 12,000.*/

        int n = 1;

        while (n*n*n < 12000){
            n++;
        }

        System.out.println(n - 1);
    }

}
