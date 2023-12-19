package week11;

public class AnimalApp {

    public static void main(String[] args) {
        Duck duck = new Duck("Donald");
        duck.move();
        duck.fly();
        duck.swim();


        Cat cat = new Cat("Tom");
        cat.swim();

        Eagle eagle = new Eagle("Mike");
        eagle.fly();
    }
}
