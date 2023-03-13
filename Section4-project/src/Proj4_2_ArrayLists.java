import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> myArrayList = new ArrayList<>();

        System.out.println("Give me a number 0 or greater. A negative number will make me stop asking you :) ");
        double userInput = keyboard.nextDouble();
        while (userInput >= 0){
            myArrayList.add(userInput);
            System.out.println("Give me a number 0 or greater. A negative number will make me stop asking you :) ");
            userInput = keyboard.nextDouble();
        }

        System.out.println("You have entered a negative number");

        for(int i = myArrayList.size() -1 ; i >= 0; i--){
            System.out.println(myArrayList.get(i));
        }
    }
}