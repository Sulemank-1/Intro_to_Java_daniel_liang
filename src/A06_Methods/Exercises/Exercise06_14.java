package A06_Methods.Exercises;

public class Exercise06_14 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "i", "m(i)");
        for (int i = 1; i<=901; i+=100)
            System.out.printf("%-10d%-10.4f\n", i, estimatePI(i));
    }

    public static double estimatePI(int n){
        double sum = 0.0;

        for(int i=1; i<=n; i++)
            sum+=(Math.pow(-1, i+1)/(2*i-1));

        sum *= 4;

        return sum;
    }
}
