package A05_Loops.Exercises;

public class Exercise05_12 {
    public static void main(String[] args) {

    }
    public static void smallestN(){
        /*(Find the smallest n such that n2 ) Use a while loop to find the smallest integer n such that n2 is greater than 12,000.*/

        int n = 1;

        while (n*n <= 12000){
            n++;
        }

        System.out.println(n);
    }

}
