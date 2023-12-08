package week9;

public class Main {
    public static void main(String[] args) {

        Point2D point2D_1 = new Point2D();
        System.out.println("point2D 1 : " + point2D_1);

        Point2D point2D_2 = new Point2D(2,9);
        System.out.println("point2D 2 : " + point2D_2);


        Point3D point3D_1 = new Point3D();
        System.out.println("point3D 1 : " + point3D_1);

        Point3D point3D_2 = new Point3D(4,-5,7);
        System.out.println("point3D 2 : " + point3D_2);



        Circle circle1 = new Circle();
        System.out.println("Circle 1 :");
        System.out.println(circle1.toString());
        System.out.println("Area : " + circle1.getArea() + "\n");

        Circle circle2 = new Circle(2);
        System.out.println("Circle 2 :");
        System.out.println(circle2.toString());
        System.out.println("Area : " + circle2.getArea() + "\n");

        Circle circle3 = new Circle(3,"bleu");
        System.out.println("Circle 3 :");
        System.out.println(circle3.toString());
        System.out.println("Area : " + circle3.getArea() + "\n");



        Cylinder cylinder1 = new Cylinder();
        cylinder1.setColor("yellow");
        System.out.println("Cylinder 1 :");
        System.out.println(cylinder1.toString());
        System.out.println("Area : " + cylinder1.getArea());
        System.out.println("Volume : " + cylinder1.getVolume() + "\n");

        Cylinder cylinder2 = new Cylinder(2);
        cylinder2.setRadius(2);
        System.out.println("Cylinder 2 :");
        System.out.println(cylinder2.toString());
        System.out.println("Area : " + cylinder2.getArea());
        System.out.println("Volume : " + cylinder2.getVolume() + "\n");

        Cylinder cylinder3 = new Cylinder(3, 3);
        System.out.println("Cylinder 3 :");
        System.out.println(cylinder3.toString());
        System.out.println("Area : " + cylinder3.getArea());
        System.out.println("Volume : " + cylinder3.getVolume() + "\n");

        Cylinder cylinder4 = new Cylinder(4,"bleu", 4);
        System.out.println("Cylinder 4 :");
        System.out.println(cylinder4.toString());
        System.out.println("Area : " + cylinder4.getArea());
        System.out.println("Volume : " + cylinder4.getVolume() + "\n");


    }
}
