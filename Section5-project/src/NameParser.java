import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your full name?");
        String fullName = keyboard.nextLine();

        int spaceIndex = fullName.indexOf(" ");
        String firstName = fullName.substring(0, spaceIndex + 1);
        String lastName = fullName.substring(spaceIndex+1);

        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toLowerCase());
    }
}
