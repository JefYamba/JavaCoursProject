package week9;

public class Pyramid extends Shape3D{


    public Pyramid(double depth, double height, double width) {
        super(depth, height, width);
    }

    @Override
    public double getVolume() {
        return (1.0/3) * depth * height * width;
    }

    @Override
    public double getArea() {
        return height * width + width * Math.sqrt(Math.pow(depth,2) + Math.pow(width/2,2)) + height * Math.sqrt(Math.pow(depth,2) + Math.pow(height/2,2));
    }

    @Override
    public String toString() {
        return "Pyramid with depth : " + depth +" width : " + width + " and height : " + height;
    }
}
