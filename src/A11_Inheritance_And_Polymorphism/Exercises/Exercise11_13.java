package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());
        }

        removeDuplicates(numbers);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }


    public static void removeDuplicates(ArrayList<Integer> list) {
         for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            for (int j = list.size() - 1; j > i; j--)
                if (num == list.get(j))
                    list.remove(j);
        }
    }
}

