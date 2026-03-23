package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> numbers = new ArrayList<>();

        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers.add(input.nextDouble());
        }

        double sum = sum(numbers);

        System.out.println(sum);
    }

    public static double sum(ArrayList<Double> list){
        double sum = 0.0;
        for (Double i: list)
            sum+=i;
        return sum;
    }
}
