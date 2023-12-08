package week2;

import java.util.Scanner;

public class Worker1 {
    String name;
    int securitySocialNumber;
    float wage;
    int workingHours;


    public Worker1() {
        new Worker1("",0,0,0);
    }

    public Worker1(String name, int securitySocialNumber, float wage, int workingHours) {
        this.name = name;
        this.securitySocialNumber = securitySocialNumber;
        this.wage = wage;
        this.workingHours = workingHours;
    }

    public void displayInfo() {
        System.out.println("name : " + this.name + "\n" +
                           "SSN  : " + this.securitySocialNumber);
    }

    public void displaySalary() {
        System.out.println("Salary : " + this.wage * this.workingHours + "Tl");
    }

    public static Worker1 createWorker(){
        System.out.println("\n Add a new week2 :  \n");
        Worker1 worker = new Worker1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        worker.name = sc.nextLine();
        System.out.print("SSN : ");
        worker.securitySocialNumber = sc.nextInt();
        System.out.print("Wage : ");
        worker.wage = sc.nextFloat();
        System.out.print("WorkingHours : ");
        worker.workingHours = sc.nextInt();

        sc.close();

        return worker;
    }
}


