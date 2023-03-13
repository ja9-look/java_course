import java.util.Scanner;

public class AverageOfThree {

    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double average;

        System.out.println("What is number 1?");
        num1 = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("What is number 2?");
        num2 = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("What is number 3?");
        num3 = keyboard.nextDouble();
        keyboard.nextLine();

        average = (num1 + num2 + num3)/3;

        System.out.println("The average of all these numbers is " + average);

    }

}
