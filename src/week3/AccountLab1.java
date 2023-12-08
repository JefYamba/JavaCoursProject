package week3;

import java.util.Scanner;

public class AccountLab1 {
    private double balance;
    private String ownerName;
    public AccountLab1(){
        System.out.println("*===================== New Account =====================*");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        this.ownerName = scanner.nextLine();
        System.out.print("Enter balance: ");
        this.balance = scanner.nextDouble();
        if (this.balance<0){
            this.balance = 0;
        }
    }

    public void add(double amount){
        if (amount > 0){
            this.balance = balance + amount;
            System.out.println("Amount added");
            System.out.println("New balance : " + balance);
        }
    }
    public void withdraw(double amount){
        if (amount > 0 ){
            if (amount <= this.balance) {
                this.balance = this.balance - amount;
                System.out.println("Amount withdrawn");
                System.out.println("New balance : " + balance);
            } else {
                System.out.println("insufficient balance");
            }
        }
    }

    public double getBalance(){
        return this.balance;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    public void setOwnerName(String name){
        this.ownerName = name;
    }

    public void showAccount(){
        System.out.println("Account : " +
                "\nOwnerName : " + this.getOwnerName() +
                "\nbalance : " + this.getBalance());
    }
}