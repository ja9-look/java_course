public class LogicalFun {
    public static void main(String[] args){
        boolean isRaining = false;
        boolean isWarm = true;

        boolean combined = isWarm && isRaining;
        System.out.println("Is it raining and warm? " + combined);

        combined = isWarm || isRaining;
        System.out.println("Is it raining and warm? " + combined);

        combined = !isRaining;
        System.out.println("Is it NOT raining and warm? " + combined);

    }
}
