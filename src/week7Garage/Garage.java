package week7Garage;

public class Garage {
    private Car[] cars;

    public Garage(Car[] cars) {
        this.cars = cars;
    }

    void printCarsOlderThan(int age){
        for (Car car: this.cars) {
            if (car.getAge() > age)
                System.out.println(car.toString());
        }
    }
}
