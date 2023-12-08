package week9;

public class Cone extends Shape3D{
    public Cone(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double getVolume() {
        return (1.0/3) * PI * Math.pow(radius, 2) * depth;
    }

    @Override
    public double getArea() {
        return PI * radius * Math.sqrt(Math.pow(radius,2) + Math.pow(depth/2,2));
    }

    @Override
    public String toString() {
        return "Cone with radius : " + radius + " and height : " + depth;
    }
}
