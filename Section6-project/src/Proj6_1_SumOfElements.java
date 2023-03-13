import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {

        ArrayList<Integer> arrayOfElements = new ArrayList<>();
        arrayOfElements.add(5);
        arrayOfElements.add(6);
        arrayOfElements.add(2);
        arrayOfElements.add(9);
        arrayOfElements.add(20);

        System.out.println(sumElements(arrayOfElements));

    }// end main

    public static int sumElements(ArrayList<Integer> arrayOfElements){
        int sumOfElements = 0;

        for(int num : arrayOfElements){
            sumOfElements += num;
        }

        return sumOfElements;
    }
}
