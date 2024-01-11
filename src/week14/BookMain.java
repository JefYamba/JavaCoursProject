package week14;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book("Alibaba", 1050d);
        Book b2 = new Book("Jungle Book", 1250d);
        Book b3 = new Book("Cinderella", 930d);
        Book b4 = new Book("Little Mermaid", 840d);

        LinkedList<Book> circleList = new LinkedList<>(List.of(b1,b2,b3,b4));
        Collections.sort(circleList);

        Iterator iterator = circleList.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
