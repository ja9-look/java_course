public class Circle {

    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public void getRadius(){
        System.out.println(radius);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void getCircumference(){
        System.out.println(2*3.14*radius);
    }

    public void getArea(){
        System.out.println(3.14*(radius*radius));
    }

}// end Circle
