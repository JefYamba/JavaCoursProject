package week9;

public class Cylinder extends Shape3D {

    public Cylinder(double depth, double radius) {
        super(depth, radius);
    }

    @Override
    public double getVolume() {
        return PI * Math.pow(radius, 2) + depth;
    }

    @Override
    public double getArea() {
        return 2 *PI * radius * (radius + depth) ;
    }

    @Override
    public String toString() {
        return "Circle with radius : " + radius + " and depth : " + depth;
    }
}
