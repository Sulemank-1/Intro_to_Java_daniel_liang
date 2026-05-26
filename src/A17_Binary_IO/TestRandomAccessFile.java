package A17_Binary_IO;

import java.io.*;

public class TestRandomAccessFile {
    public static void main(String[] args) throws IOException{
        try(
                RandomAccessFile inout = new RandomAccessFile("inout.data", "rw")
                ){
            inout.setLength(0);

            for (int i = 0; i < 200; i++) {
                inout.writeInt(i);
            }

            System.out.println("Current length of file is " + inout.length());

            inout.seek(0);
            System.out.println("This first number is " + inout.readInt());

            inout.seek(1 * 4);
            System.out.println("The second number is " + inout.readInt());

            inout.seek(9 * 4);
            System.out.println("The tenth number is " + inout.readInt());

            inout.writeInt(555);

            inout.seek(inout.length());
            inout.writeInt(999);

            System.out.println("The new length is " + inout.length());

            inout.seek(10 * 4);
            System.out.println("The eleventh number is " + inout.readInt());
        }
    }
}
