import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("The 10 rolled dices are: ");
        for(int i = 0; i < 10; i++){
            System.out.println(random.nextInt(6) + 1);
        }
    }
}
