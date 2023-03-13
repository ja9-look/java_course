import java.util.Random;

public class twice2DArray {
    public static void main(String[] args) {
        int[][] my2DArray = new int[2][3];

        fill2DArray(my2DArray);
        print2DArray(my2DArray);

    } //end main

    public static void fill2DArray(int[][] twoDArray){
        Random rand = new Random();

        for(int i=0; i < twoDArray.length; i++){
            for(int j=0; j < twoDArray[i].length; j++){

                twoDArray[i][j] = (rand.nextInt(100))*2;
            }
        }
    } //end fill2DArray

    public static void print2DArray(int[][] twoDArray){
       for(int[] arr : twoDArray){
           for(int num: arr) {
               System.out.print (num + " ");
           }
           System.out.println();
       }
    } //end print2DArray
}
