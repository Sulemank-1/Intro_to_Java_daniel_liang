package A11_Inheritance_And_Polymorphism.Exercises;

import A10_Object_Oriented_Thinking.Loan;
import A11_Inheritance_And_Polymorphism.Circle;

import java.util.ArrayList;
import java.util.Date;

public class Exercise11_06 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Loan(2.5, 10, 10000));
        objects.add(new Date());
        objects.add("Suleman");
        objects.add(new Circle(5));

        for (Object o: objects)
            System.out.println(o.toString());
    }
}


