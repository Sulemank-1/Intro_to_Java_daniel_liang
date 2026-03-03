package A06_Methods.Exercises;

public class Exercise06_13 {
    public static void main(String[] args) {
        int n = 20;
        System.out.printf("%-5s%-5s\n", "i", "m(i)");
        for (int j = 1; j<=n; j++)
            System.out.printf("%-5d%-5.4f\n", j, sumSeries(j));
    }

    public static double sumSeries(int n){
        double sum = 0;
        for (int i = 1; i<=n; i++){
            sum += (i/(i+1.0));
        }
        return sum;
    }
}
