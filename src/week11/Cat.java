package week11;

public class Cat extends Animal implements Swimmable{
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Cat " + name + " is swimming");
    }
}
