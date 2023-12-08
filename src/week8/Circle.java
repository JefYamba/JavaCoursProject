package week8;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this(1);
    }
    public Circle(double radius) {
        this(radius, "red");
    }
    public Circle(double radius, String color) {
        this.setRadius(radius);
        this.setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.getRadius(),2);
    }

    @Override
    public String toString() {
        return "Circle [ radius : " + this.getRadius() + " and color : " + this.getColor() + ']';
    }
}
