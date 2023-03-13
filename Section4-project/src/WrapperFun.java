import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();

        myAL.add(10);
        myAL.add(12);
        myAL.add(15);

        for(int i : myAL){
            System.out.println(i);
        }

        String someValue = "250";
        int numValue = Integer.parseInt(someValue);
        numValue+=10;
        System.out.println(numValue);

        String someDouble = "250.56";
        double doubleValue = Double.parseDouble(someDouble);
        System.out.println(doubleValue);
    }
}
