package week6;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(0, "joph", "yamba", 23);
        Person p2 = new Person("joph", "yamba");
        Person p3 = new Person(3);
        Person p4 = new Person();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
