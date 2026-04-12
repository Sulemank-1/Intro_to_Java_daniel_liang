package A11_Inheritance_And_Polymorphism;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<Date> dates = new ArrayList<>();

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 1; i <= 10; i++)
            integers.add(i);

        integers.remove(new Integer(4));

        System.out.println(integers.toString());

        String[] array = {"red", "green", "blue"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

        String[] array1 = new String[list.size()];
        list.toArray(array1);

    }
}
