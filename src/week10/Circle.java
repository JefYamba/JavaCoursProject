package week10;

public class Circle extends Shape2D{


    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle with radius : " + radius;
    }
}
