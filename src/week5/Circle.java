package week5;

public class Circle {
    private final double PI = 3.141519;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void computeArea(){
        System.out.println("area = " + PI * radius * radius);
    }

}
