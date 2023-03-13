public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[10];

        for(int i=0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            System.out.println(myArray[i]);
        }

        System.out.println("\nStart of enhanced for loop\n");

        for(int i : myArray) {
            System.out.println(i);
        }
    }
}