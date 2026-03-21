package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt();
            if (value != 0)
                list.add(value);
        }while (value != 0);

        System.out.println(max(list));

    }

    public static Integer max(ArrayList<Integer> list){
        if (list.isEmpty())
            return null;
        return Collections.max(list);
    }
}
