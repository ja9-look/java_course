public class HouseDemo {
    public static void main(String[] args) {

        House myHouse = new House(6, 3, "red");
        House yourHouse = new House(7, 29, "blue");

        printHouseStatement(myHouse);
        printHouseStatement(yourHouse);

    } // end main

    public static void printHouseStatement(House house){
        System.out.println("The house is " + house.getColor() + " and has " + house.getNumStories() + " stories and " + house.getNumWindows() + " windows.");
    }
} // end HouseDemo
