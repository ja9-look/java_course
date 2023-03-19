import java.util.ArrayList;

public class IceCream {

    public String name;
    public int cost;
    public int numScoops;
    public ArrayList<String> toppings;

    public IceCream(String name, int cost, int numScoops, ArrayList<String> toppings){
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
        this.toppings = toppings;
    }

    public void addTopping(String topping){
        this.toppings.add(topping);
    }

    public void getName(){
        System.out.println(name);
    }

    public void getCost(){
        System.out.println(cost);
    }

    public void getNumScoops(){
        System.out.println(numScoops);
    }

    public void printToppings(){
        for(String topping: toppings){
            System.out.println(topping);
        }
    }


} // end IceCream
