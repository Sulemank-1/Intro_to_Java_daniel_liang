package A09_Objects_And_Classes.Exercises;

import java.util.Scanner;

public class Exercise09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        if (equation.getDiscriminant() > 0){
            System.out.println("Root 1: " + equation.getRoot1());
            System.out.print("Root 2: " + equation.getRoot2());
        }else if (equation.getDiscriminant() == 0)
            System.out.println("Root 1: " + equation.getRoot1());
        else
            System.out.println("The equation has no roots.");

    }
}

class QuadraticEquation{
    private double a;
    private double b;
    private double c;


    public QuadraticEquation(double newA, double newB, double newC){
        a = newA;
        b = newB;
        c = newC;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getDiscriminant(){
        return b*b - (4 * a * c);
    }

    public double getRoot1(){
        if (getDiscriminant() >= 0)
            return (-b + Math.pow(getDiscriminant(), 0.5)) / (2*a);

        return 0;
    }

    public double getRoot2(){
        if (getDiscriminant() >= 0)
            return (-b - Math.pow(getDiscriminant(), 0.5)) / (2*a);

        return 0;
    }
}
