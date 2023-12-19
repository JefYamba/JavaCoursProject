package week11;

public class Eagle extends Animal implements Flyable{

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("Eagle " + name + " is flying");
    }
}
