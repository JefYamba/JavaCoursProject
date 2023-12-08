package week3;

public class Main {
    public static void main(String[] args) {

        AccountLab1 account1 = new AccountLab1();
        account1.add(100);
        account1.add(-10);
        account1.withdraw(200);
        account1.withdraw(20);
        account1.showAccount();
        

        AccountLab2 account2 = new AccountLab2();
        account2.add(100);
        account2.add(-10);
        account2.withdraw(200);
        account2.withdraw(20);
        account2.showAccount();
    }
}
