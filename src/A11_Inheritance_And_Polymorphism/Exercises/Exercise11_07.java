package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            numbers.add(i);
        }
        shuffle(numbers);
        System.out.println(numbers);

    }

    public static void shuffle(ArrayList<Integer> list){
        Collections.shuffle(list);
    }
}
