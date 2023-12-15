package week10;

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
        return "Cylinder with radius : " + radius + " and height : " + depth;
    }
}
