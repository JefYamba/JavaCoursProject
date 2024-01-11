package week14;

import java.util.Comparator;

public class Circle {
    private final double PI = 3.14;
    private final double radius;
    private final String color;


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Double computeArea(){
        return radius * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle : radius  = " + radius + ", color = " + color ;
    }
}

class AriaCompare implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        return Double.compare(c1.computeArea(),c2.computeArea());
    }
}
