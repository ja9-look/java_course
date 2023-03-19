import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner nums;
        PrintWriter twicenums;

        try {
            nums = new Scanner(new File("nums.txt"));
            int input;
            twicenums = new PrintWriter("twice_nums.txt");

            while(nums.hasNext()){
                input = nums.nextInt();
                twicenums.println(input*2);
            }

            nums.close();
            twicenums.close();
        } catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    } // end main
} // end TwiceData
