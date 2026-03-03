package A05_Loops.Exercises;

public class Exercise05_25 {
    public static void main(String[] args) {

    }
    public static void computePi(){
        double sum = 0.0;
        int n = 100000;

        for(int i=1; i<=n; i++)
            sum+=(Math.pow(-1, i+1)/(2*i-1));

        sum *= 4;

        System.out.println(sum);
    }

}
