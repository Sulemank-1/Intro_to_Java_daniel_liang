package A06_Methods.Exercises;

public class Exercise06_09 {
    public static void main(String[] args) {
        System.out.printf("%-12s%-12s%-5s%-12s%-12s\n", "Feet", "Meters", "|", "Feet", "Meters");
        double f = 1.0;
        double m = 20.0;
        while (f <= 10.0){
            System.out.printf("%-12.1f%-12.3f%-5s%-12.1f%-12.3f\n", f, footToMeter(f), "|", m,
                    meterToFoot(m));
            f++;
            m+=5;
        }
    }

    public static double footToMeter(double foot){
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
