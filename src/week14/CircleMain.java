package week14;

import java.util.*;

public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(2, "red");
        Circle c2 = new Circle(4, "green");
        Circle c3 = new Circle(3, "blue");

        LinkedList<Circle> circleList = new LinkedList<>(List.of(c1,c2,c3));

        AriaCompare ariaCompare = new AriaCompare();

        circleList.sort(ariaCompare);
        ListIterator<Circle> listIterator = circleList.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }
}
