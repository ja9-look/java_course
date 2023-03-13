import java.util.Random;

public class RandomFun {
    public static void main(String[] args){

        Random random = new Random();
        int myRandomNum = random.nextInt();

        System.out.println("The random number is: " + myRandomNum);

        myRandomNum = random.nextInt(1000);
        System.out.println("The random number 0 - 999 is: " + myRandomNum);

    } //end main
}
