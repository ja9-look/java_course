public class CircleDemo {
    public static void main(String[] args) {

        Circle myCircle = new Circle();
        Circle yourCircle = new Circle(4);

        myCircle.getRadius();
        myCircle.getCircumference();
        myCircle.getArea();
        myCircle.setRadius(5);
        myCircle.getRadius();
        myCircle.getCircumference();
        myCircle.getArea();
        System.out.println();
        yourCircle.getRadius();
        yourCircle.getCircumference();
        yourCircle.getArea();
        yourCircle.setRadius(3);
        yourCircle.getRadius();
        yourCircle.getCircumference();
        yourCircle.getArea();

    } // end main
} // end Circle
