import java.util.ArrayList;

public class IceCreamDemo {
    public static void main(String[] args) {

        ArrayList<String> toppings = new ArrayList<>();
        toppings.add("Chocolate Chips");
        toppings.add("Strawberries");
        toppings.add("Mochi Bites");
        IceCream myIceCream = new IceCream("Janine's Ice Cream", 10, 2, toppings);

        myIceCream.printToppings();
        myIceCream.addTopping("Almond Crumble");
        myIceCream.getName();
        myIceCream.getCost();
        myIceCream.getNumScoops();
        System.out.println();
        myIceCream.printToppings();

    } // end main
} // end IceCreamDemo
