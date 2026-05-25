package A17_Binary_IO.Exercises;

import java.io.*;

public class Exercise17_03 {
    public static void main(String[] args){
        File file = new File("Exercise17_02.dat");
        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))
        ){
            while (true)
                System.out.print(input.readInt() + " ");
        }catch (EOFException ex){
            System.out.println("End of file.");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
