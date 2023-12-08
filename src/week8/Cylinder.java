package week8;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        this.setHeight(1);
    }

    public Cylinder(double height) {
        this.setHeight(height);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.setHeight(height);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return Math.PI * Math.pow(this.getRadius(),2) * this.getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder [ radius : " + this.getRadius() + ", height :  " + this.getHeight() + " and color : " + this.getColor() + ']';
    }
}
