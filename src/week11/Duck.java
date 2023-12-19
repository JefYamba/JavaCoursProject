package week11;

public class Duck extends Animal implements Movable, Flyable, Swimmable{
    public Duck(String name) {
        this.name = name;
    }


    @Override
    public void fly() {
        System.out.println("Duck " + name + " is flying");
    }

    @Override
    public void move() {
        System.out.println("Duck " + name + " is moving");
    }

    @Override
    public void swim() {
        System.out.println("Duck " + name + " is swimming");
    }
}
