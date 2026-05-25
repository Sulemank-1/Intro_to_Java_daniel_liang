package A17_Binary_IO.Exercises;

import java.io.*;
import java.util.Scanner;

public class Exercise17_04 {
    public static void main(String[] args) {
        File textFile = new File("Hello_World.txt");
        File binaryFile = new File("Hello_World.utf");

        try {
            try (PrintWriter output = new PrintWriter(textFile)) {
                output.println("Hello World");
                output.println("Suleman");
            }

            try (
                    Scanner input = new Scanner(textFile);
                    DataOutputStream outputStream = new DataOutputStream(
                            new BufferedOutputStream(new FileOutputStream(binaryFile)))
            ) {
                while (input.hasNextLine()) {
                    outputStream.writeUTF(input.nextLine());
                }
            }

            System.out.println("Text file size: " + textFile.length());
            System.out.println("Binary file size: " + binaryFile.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}