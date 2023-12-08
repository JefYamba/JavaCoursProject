package week7Garage;

import java.sql.Time;
import java.time.Instant;
import java.util.Calendar;

public class Car {
    private int id;
    private int productionYear;
    private int power;
    public static int counter = 0;

    public Car(int id, int productionYear) {
        counter++;
        this.id = id;
        this.productionYear = productionYear;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getAge(){
        return Calendar.getInstance().get(Calendar.YEAR) - this.productionYear;
    }

    public void startAndMove(){
        System.out.println("The car " + id +" starts");
        System.out.println("The car " + id +" moves");
    }

    public void stop(){
        System.out.println("The car " + id +" stops");
    }

    @Override
    public String toString() {
        return "Car : id = " + id +
                ", Age = " + getAge() +
                ", Power=" + this.power ;
    }
}
