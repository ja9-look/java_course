import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        runGame();
    } // end main

    public static void runGame(){
        String winner = "";
        boolean xTurn = true;
        String[][] matrix = new String[3][3];

        initialiseGame(matrix);
        printGame(matrix);

        while(winner.equals("")){
            if(xTurn){
                System.out.println("It's X's turn");
            } else {
                System.out.println("It's O's turn");
            }

            getUserInput(xTurn, matrix);
            System.out.println();

            printGame(matrix);
            winner = getWinner(matrix);
            xTurn = !xTurn;

            if(winner.equals("") && isBoardFull(matrix)){
                winner = "C";
            } // end if statement
        } // end while loop

        // cat's game?
        System.out.println();

        if(winner.equals("C")){
            System.out.println("It was the Cat's game! No one won.");
        } else {
            System.out.println("The winner is " + winner);
        }
    } // end runGame

    public static void initialiseGame(String[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = " ";
            }
        }
    } // end initialiseGame

    public static void printGame(String[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
                if (j < 2){
                    System.out.print("  |  ");
                }
            }
            System.out.println();
            if (i < 2){
                System.out.println("- - - - - - -");
            }
        }
        System.out.println(matrix);
    } // end printGame

    public static void getUserInput(boolean xTurn, String[][] matrix){
        Scanner keyboard = new Scanner(System.in);
        int row = -1;
        int col = -1;
        boolean keepAsking = true;

        while(keepAsking){
            System.out.println("Please enter the row then " + "the column, each from 0, 1, or 2, " + "separated by a space");

            row = keyboard.nextInt();
            col = keyboard.nextInt();
            keyboard.nextLine();

            if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
                if(!cellAlreadyOccupied(row,col,matrix)){
                    keepAsking = false;
                } else {
                    System.out.println("That cell is already occupied");
                }
            }
        } // end while

        matrix[row][col] = xTurn ? "X" : "O";
    } // end getUserInput

    public static boolean cellAlreadyOccupied(int row, int col, String[][] matrix){
        return !matrix[row][col].equals(" ");
    }

    public static String getWinner(String[][] matrix) {
        //  check rows
        for (int i = 0; i < matrix.length; i++) {
            if (!matrix[i][0].equals(" ") && matrix[i][0].equals(matrix[i][1]) && matrix[i][1].equals(matrix[i][2])) {
                return matrix[i][0];
            }
        } // end for loop

        // check columns
        for (int i = 0; i < matrix[0].length; i++) {
            if (!matrix[0][i].equals(" ") && matrix[0][i].equals(matrix[1][i]) && matrix[1][i].equals(matrix[2][i])) {
                return matrix[0][i];
            }
        }// end for loop

        // check diagonals
        if (!matrix[0][0].equals(" ") && matrix[0][0].equals(matrix[1][1]) && matrix[1][1].equals(matrix[2][2])) {
            return matrix[0][0];
        }

        if (!matrix[2][0].equals(" ") && matrix[2][0].equals(matrix[1][1]) && matrix[1][1].equals(matrix[0][2])) {
            return matrix[2][0];
        }

        return "";

    }


    public static boolean isBoardFull(String[][] matrix) {
        int countFill = 0;
        for (String[] arr : matrix) {
            for (String string : arr) {
                if (string.equals(" ")) {
                    countFill++;
                }
            }
        }
        return countFill == 9;
    } // end isBoardFull


}
