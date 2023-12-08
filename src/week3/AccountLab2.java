package week3;

import java.util.Scanner;
public class AccountLab2 {
    private double balance;
    private String ownerName;
    private final int password;
    public AccountLab2(){
        System.out.println("*===================== New Account =====================*");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name : ");
        this.ownerName = scanner.nextLine();

        while (true){ // the password must be a 4-digit password otherwise it must be entered again
            System.out.print("Enter a 4-digit password (ex: 1234) : ");
            int pass = scanner.nextInt();
            if (pass >= 1000 && pass <= 9999){
                this.password = pass;
                break;
            } else {
                System.out.println("Please enter a 4-digit password (ex: 1234)");
            }
        }
        while (true){ // the amount must be greater than zero otherwise it must be entered again
            System.out.print("Enter balance : ");
            double amount = scanner.nextDouble();
            if (amount >= 0){
                this.balance = amount;
                break;
            } else {
                System.out.println("Please enter the a positive amount");
            }
        }
    }

    public void add(double amount){
        if (amount > 0){ // If the amount is less than 0 or equal to 0, nothing will be donne
            this.balance += amount;
            System.out.println("Amount added");
            System.out.println("New balance : " + this.balance);
        }
    }

    public void withdraw(double amount){
        if (amount > 0){ // If the amount is less than 0 or equal to 0, nothing will be donne
            int tries = 3;
            while(tries > 0) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please enter a 4-digit pass : ");
                int pass = scanner.nextInt();
                if (pass == this.password) {
                    if (amount <= this.balance) {
                        this.balance -= amount;
                    } else {
                        System.out.println("insufficient balance");
                    }
                    break;
                } else {
                    tries--;
                    System.out.println("try again ,Attempts left : " + tries);
                }
            }

            if(tries <= 0){
                System.out.println("Account blocked");
            } else {
                System.out.println("Amount withdrawn");
                System.out.println("New balance : " + this.balance);
            }
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String name){
        ownerName = name;
    }

    public void showAccount(){
        System.out.println("Account : " +
                "\nOwnerName : " + this.getOwnerName() +
                "\nbalance : " + this.getBalance());
    }
}