package week2;

public class Worker {
    private String name;
    private int securitySocialNumber;
    private float wage;
    private int workingHours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSecuritySocialNumber() {
        return securitySocialNumber;
    }

    public void setSecuritySocialNumber(int securitySocialNumber) {
        this.securitySocialNumber = securitySocialNumber;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public Worker() {
        new Worker("",0,0,0);
    }

    public Worker(String name, int securitySocialNumber, float wage, int workingHours) {
        this.setName(name);
        this.setSecuritySocialNumber(securitySocialNumber);
        this.setWage(wage);
        this.setWorkingHours(workingHours);
    }

    public void displayInfo() {
        System.out.println("name : " + this.getName() + "\n" +
                           "SSN  : " + this.getSecuritySocialNumber());
    }

    public void displaySalary() {
        System.out.println("Salary : " + this.getWage() * this.getWorkingHours() + "tl");
    }

}


