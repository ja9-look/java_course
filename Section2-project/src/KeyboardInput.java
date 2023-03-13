import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        double realNumber;


        System.out.println("What is your name? ");
        name = keyboard.nextLine();

        System.out.println("What is your number of choice? ");
        realNumber = keyboard.nextDouble();
        realNumber*=2;
        keyboard.nextLine();

        System.out.println("What is your city? ");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("Real number doubled is " + realNumber);
        System.out.println("City is " + city);
    }
}
