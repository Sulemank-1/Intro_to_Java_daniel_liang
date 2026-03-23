package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise11_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers.add(input.nextInt());
        }

        sort(numbers);

        System.out.println(numbers);
    }

    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
    }
}
