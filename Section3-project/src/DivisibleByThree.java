import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int userInput = keyboard.nextInt();

        if (userInput % 3 == 0) {
            System.out.println("This number is divisible by 3");
        } else {
            System.out.println("This number is not divisible by 3");
        }
    }
}
