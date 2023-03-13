import java.util.Scanner;

public class MadLibsClone {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String adj1;
        String adj2;
        String adj3;
        String occ1;
        String occ2;
        String place;
        String clothing;
        String hobby;
        String girlName;
        String boyName;
        String manName;

        System.out.println("Give me 3 adjectives: ");
        adj1 = keyboard.nextLine();
        adj2 = keyboard.nextLine();
        adj3 = keyboard.nextLine();

        System.out.println("Give me 2 occupations: ");
        occ1 = keyboard.nextLine();
        occ2 = keyboard.nextLine();

        System.out.println("Give me a place: ");
        place = keyboard.nextLine();

        System.out.println("Give me a clothing: ");
        clothing = keyboard.nextLine();

        System.out.println("Give me a hobby: ");
        hobby = keyboard.nextLine();

        System.out.println("Give me a girl name: ");
        girlName = keyboard.nextLine();

        System.out.println("Give me a boy name: ");
        boyName = keyboard.nextLine();

        System.out.println("Give me a man name: ");
        manName = keyboard.nextLine();

        String story = "There once was a " + adj1 + " girl named " + girlName + ", who was a " + adj2 + " " + occ1 + " in the Kingdom of " + place + ". She loved to wear " + clothing + " and to " + hobby + ". She wanted to marry the " + adj3 + " " + occ2 + " named " + boyName + " but her father, King " + manName + " forbid her from seeing him.";

        System.out.println(story);
    }
}
