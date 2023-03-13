public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Janine Luk");

        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(7, "Samantha ");
        System.out.println(sb);

        sb.delete(7,16);

        sb.replace(0, 6, "Miss.");
        System.out.println(sb);
    }
}
