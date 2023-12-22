package week12;

public class BankAccount implements Comparable<BankAccount>{
    private int accountNo;
    private String holderName;
    private double balance;

    public BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void balanceChange(double amount){
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account N° " + accountNo + " : holderName : " + holderName + " ande balance : " + balance ;
    }


    @Override
    public int compareTo(BankAccount account) {
        return this.holderName.compareTo(account.holderName);
    }

}
