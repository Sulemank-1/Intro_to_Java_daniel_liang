package A17_Binary_IO.Exercises;

import java.io.*;
import java.util.Date;

public class Exercise17_05 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        int[] numbers = {1,2,3,4,5};
        double doubleNumber = 5.5;
        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"))
        ){
            output.writeObject(numbers);
            output.writeDouble(doubleNumber);
            output.writeObject(new Date());
        }

        try (
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_05.dat"))
        ){
            int[] newNumbers = (int[]) (input.readObject());
            double newDoubleNumber = input.readDouble();
            Date date = (Date) (input.readObject());

            for (int nums : newNumbers)
                System.out.print(nums + " ");

            System.out.println();

            System.out.println(date);
            System.out.println(newDoubleNumber);
        }
    }
}
