package A06_Methods.Exercises;

public class Exercise06_08 {
    public static void main(String[] args) {
        System.out.printf("%-12s%-12s%-5s%-12s%-12s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
        double c = 40.0;
        double f = 120.0;
        while (c >= 31.0){
            System.out.printf("%-12.1f%-12.1f%-5s%-12.1f%-12.2f\n", c, celsiusToFahrenheit(c), "|", f,
                    fahrenheitToCelsius(f));
            c--;
            f-=10;
        }

    }

    public static double celsiusToFahrenheit(double celsius){
        return (9.0/5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0/9) * (fahrenheit - 32);
    }
}
