package A17_Binary_IO.Exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise17_01 {
    public static void main(String[] args) throws IOException {
        File file = new File("Exercise17_01.txt");
        try (PrintWriter output = new PrintWriter(file)){
            for (int i = 0; i < 100; i++) {
                output.print((int)(Math.random() * 100) + " ");
            }
        }

    }
}
