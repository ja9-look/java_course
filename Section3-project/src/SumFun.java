import java.util.Scanner;

public class SumFun {

    public static void  main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int input;
        int sum = 0;

        System.out.println("What is the integer? ");
        input = keyboard.nextInt();

        while (input >= 0){
            sum += input;
            System.out.println("What is the integer? ");
            input = keyboard.nextInt();
        }

        System.out.println(sum);

    }
}
