package week7Garage;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(147,1990);
        car1.setPower(120);
        Car car2 = new Car(258,1967);
        car2.setPower(380);
        Car car3 = new Car(369,2023);
        car3.setPower(900);
        Car car4 = new Car(456,2007);
        car4.setPower(1200);

        Car[] cars = new Car[]{car1,car2,car3,car4};

        Garage garage = new Garage(cars);


        System.out.println("list of the cars older than 2 years");
        garage.printCarsOlderThan(2);

        System.out.println("The number of cars in the garage : " + Car.counter);
    }
}
