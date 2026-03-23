package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_14 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter 5 integers in list1: ");
        addToList(list1);
        System.out.print("Enter 5 integers in list2: ");
        addToList(list2);

        System.out.println("The combined list is " + union(list1, list2));


    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> union = list1;
        for (Integer i: list2)
            union.add(i);
        return union;
    }

    public static void addToList(ArrayList<Integer> list){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
    }
}

