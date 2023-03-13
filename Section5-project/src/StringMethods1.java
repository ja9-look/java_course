public class StringMethods1 {
    public static void main(String[] args) {
        String name = "Janine Luk";
        String name2 = "John Baugh";
        String name3 = "Rob Percival";

        for(int i = 0 ; i < name.length(); i++){
            System.out.println(name.charAt(i) + " ");
        }

        System.out.println();

        if(name.equals(name2)){
            System.out.println("Names are equal");
        } else {
            System.out.println("Names aren't equal");
        }

        if(name.compareTo(name3) > 0){
            System.out.println("Name > name3");
        } else if (name.compareTo(name3) == 0){
            System.out.println("Name is the same as name3");
        } else {
            System.out.println("Name < name3");
        }
    }
}