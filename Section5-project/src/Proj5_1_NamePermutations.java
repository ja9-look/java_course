import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] firstNames = new String[5];
        String[] lastNames = new String[5];

        for(int i = 0; i < firstNames.length; i++){
            System.out.println("What is your full name?");
            String fullName = keyboard.nextLine();
            int spaceIndex = fullName.indexOf(" ");
            firstNames[i] = fullName.substring(0, spaceIndex);
            lastNames[i] = fullName.substring(spaceIndex + 1);
        }

        for(int i = 0; i < firstNames.length; i++ ){
            for(int j = 0; j < lastNames.length; j++){
                System.out.println(firstNames[i] + " " + lastNames[j]);
            }
        }

      }
}
