package week9;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        //No need to a redundant code like this
//        Circle circle = new Circle(2);
//        System.out.println(circle);
//        System.out.println(circle.getArea());
//
//        Square square = new Square(2);
//        System.out.println(square);
//        System.out.println(square.getArea());


        // this is much better
        Shape2D[] shape2DS = {new Circle(2), new Square(2), new Rectangle(2,3)};
        for (Shape2D shape2D : shape2DS){
            System.out.println(shape2D);
            System.out.println("Area : " + decimalFormat.format(shape2D.getArea()) );
        }


        Shape3D[] shape3DS = {new Cylinder(2,1.5), new Sphere(3,2), new Pyramid(4,2,3), new Cone(3,2)};
        for (Shape3D shape3D : shape3DS){
            System.out.println(shape3D);
            System.out.println("Area : " + decimalFormat.format(shape3D.getArea()));
            System.out.println("Volume : " + decimalFormat.format(shape3D.getVolume()));
        }


    }
}
