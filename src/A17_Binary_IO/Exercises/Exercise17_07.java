package A17_Binary_IO.Exercises;

import java.io.*;
import java.util.ArrayList;

public class Exercise17_07 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        try (
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_06.dat"))
        ){
            ArrayList<Loan> loans = new ArrayList<>();

            try {
                while (true)
                    loans.add((Loan) (input.readObject()));
            }catch (EOFException ex){
                System.out.println("End of file");
            }

            double totalLoanAmount = 0.0;
            for (Loan loan : loans)
                totalLoanAmount += loan.getLoanAmount();
            System.out.println(totalLoanAmount);
        }
    }
}



