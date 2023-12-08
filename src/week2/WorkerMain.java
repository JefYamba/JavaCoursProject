package week2;

import java.util.Scanner;

public class WorkerMain {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        worker1.setName("Jôph Yamba");
        worker1.setSecuritySocialNumber(123121234);
        worker1.setWage(72);
        worker1.setWorkingHours(240);

        worker1.displayInfo();
        worker1.displaySalary();

        // New week2
        System.out.println("\nNew week2 :  \n");
        Worker worker2 = new Worker();
        Scanner sc = new Scanner(System.in);

        System.out.print("Name : ");
        worker2.setName(sc.nextLine());
        System.out.print("SSN : ");
        worker2.setSecuritySocialNumber(sc.nextInt());
        System.out.print("Wage : ");
        worker2.setWage(sc.nextFloat());
        System.out.print("WorkingHours : ");
        worker2.setWorkingHours(sc.nextInt());

        sc.close();

        worker2.displayInfo();
        worker2.displaySalary();
    }
}
