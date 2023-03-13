public class MethodCalls {
    public static void main(String[] args) {
        countUpTo(3,10);
    }

    public static void countUpTo(int num1, int num2){
        if (num1 <= num2){
            System.out.println(num1);
            countUpTo(num1 + 1, num2);
        }
    }
}
