package week10;

public class Sphere extends Shape3D{ // This class is an Ellipsoïd not a sphere

    public Sphere(double depth, double radius) {
        super(depth, radius);
    }

    @Override
    public double getVolume() {
        return (4.0/3) * PI * depth * Math.pow(radius, 2);
    }

    @Override
    public double getArea() {
        return PI + depth * radius;
    }

    @Override
    public String toString() {
        return "Sphere with radius : " + radius + " and depth : " + depth;
    }
}
