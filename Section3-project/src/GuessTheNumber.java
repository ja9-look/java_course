import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int selectedNumber = random.nextInt(100) + 1;

        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            System.out.println("This is guess number: " + (i+1));
            System.out.println("Guess the random number!");
            int guessedNumber = keyboard.nextInt();
            if (guessedNumber == selectedNumber){
                System.out.println("You guessed the correct number!");
                break;
            }
        }

    }
}
