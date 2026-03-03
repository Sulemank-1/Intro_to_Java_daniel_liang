package A09_Objects_And_Classes.Exercises;

import java.util.Scanner;

public class Exercise09_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation1 equation = new LinearEquation1(a, b, c, d, e, f);

        if (equation.isSolvable())
            System.out.println("x is " + equation.getX() + " y is " + equation.getY());
        else
            System.out.println("The equation has no solution");

    }
}

class LinearEquation{
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF){
        a = newA;
        b = newB;
        c = newC;
        d = newD;
        e = newE;
        f = newF;
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

    public double getD(){
        return d;
    }

    public double getE(){
        return e;
    }

    public double getF(){
        return f;
    }

    public boolean isSolvable(){
        return (a*d - b*c) != 0;
    }

    public double getX(){
        return (e*d - b*f) / (a*d - b*c);
    }

    public double getY(){
        return (a*f - e*c) / (a*d - b*c);
    }
}
