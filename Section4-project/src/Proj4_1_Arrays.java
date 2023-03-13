import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        Scanner keyboard = new Scanner(System.in);

        for (int i=0; i < myArray.length; i++) {
            System.out.println("Give me a number: ");
            myArray[i] = keyboard.nextInt();
        }

        for(int i : myArray){
            int result = i * 2;
            System.out.println(result);
        }
    }
}
