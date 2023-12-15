package week10;

public class Square extends Shape2D{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Square with width : " + width;
    }
}

