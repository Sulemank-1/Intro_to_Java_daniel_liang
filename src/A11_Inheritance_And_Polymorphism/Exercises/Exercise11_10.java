package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack = new MyStack();

        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}


class MyStack extends ArrayList<Object> {

    public boolean isEmpty(){
        return super.isEmpty();
    }

    public int getSize(){
        return size();
    }

    public Object peek(){
        return get(getSize() - 1);
    }

    public Object pop(){
        return remove(getSize() - 1);
    }

    public void push(Object o){
        add(o);
    }

    @Override
    public String toString(){
        return "Stack: " + super.toString();
    }
}
