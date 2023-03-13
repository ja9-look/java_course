import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] names = new String[5];
        int[] ages = new int[5];
        String[] namesAndAges = new String[5];

        for(int i=0; i < names.length; i++){
            System.out.println("What is your name?");
            names[i] = keyboard.nextLine();
            System.out.println("What is your age?");
            ages[i] = keyboard.nextInt();
            keyboard.nextLine();
            namesAndAges[i] = names[i] + " is " + ages[i];
        }

        for(String nameAndAge : namesAndAges){
            System.out.println(nameAndAge);
        }
    }
}
