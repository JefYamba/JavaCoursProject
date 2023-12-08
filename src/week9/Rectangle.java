package week9;

public class Rectangle extends Shape2D{

    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle with width : " + width + " and height : " + height;
    }
}
