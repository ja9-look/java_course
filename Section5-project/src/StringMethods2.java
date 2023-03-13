public class StringMethods2 {
    public static void main(String[] args) {
        String myName = "Janine Luk";
        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsJ = myName.indexOf("J");

        String lastName = myName.substring(7);

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(whereIsJ);
        System.out.println(lastName);
    }
}
