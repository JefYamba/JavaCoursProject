package week4;

public class Worker {
    private String name;
    private double salary;
    public static int counter = 0;

    public Worker() {
        new Worker("",0);
    }

    public Worker(String name, double salary) {
        this.setName(name);
        this.setSalary(salary);
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            throw new IllegalArgumentException("ERROR : salary amount must be greater than zero!");
        }
        this.salary = salary;
    }
}
