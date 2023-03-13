public class MethodLoading {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);

        result = getResult(4,5);
        System.out.println(result);

        result = getResult(4,"12");
        System.out.println(result);

        System.out.println(getResult("hello", "janine"));
    }

    public static int getResult(int num1){
        return num1 * 2;
    }

    public static int getResult(int num1, int num2){
        return num1 * num2;
    }

    public static int getResult(int num1, String value){
        return num1 * Integer.parseInt(value);
    }

    public static String getResult(String value1, String value2){
        return value1 + " " + value2;
    }

}
