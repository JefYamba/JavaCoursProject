package week12;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void switchPairs(List<String> stringList){
        for (int i = 0; i < stringList.size(); i+=2){
            if (stringList.get(i+1) != null){
                String temp = stringList.get(i+1);
                stringList.set(i+1, stringList.get(i));
                stringList.set(i, temp);
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("##########  Bank Accounts \n");

        BankAccount a1 = new BankAccount(1, "Ahmed", 1500);
        BankAccount a2 = new BankAccount(3, "Zaynab", 3850);
        BankAccount a3 = new BankAccount(2, "John", 4500);
        BankAccount a4 = new BankAccount(4, "Ali", 1760);

        BankAccount temp;

        List<BankAccount> myAccounts = new ArrayList<>();
        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);

        for (int i = 0; i < myAccounts.size(); i++){
            for (int j = 0; j < i; j++){
                if (myAccounts.get(j).compareTo(myAccounts.get(i)) > 0 ){
                    temp = myAccounts.get(j);
                    myAccounts.set(j, myAccounts.get(i));
                    myAccounts.set(i, temp);
                }
            }
        }

        System.out.println("// Before the change of balance\n");
        myAccounts.forEach(System.out::println);

        for (BankAccount account : myAccounts)
            account.balanceChange(500);


        System.out.println("\n// After the change of balance\n");
        myAccounts.forEach(System.out::println);


        System.out.println("\n\n##########  Switch pairs\n");
        String[] strList1 = new String[]{"four ","score ", "and ", "seven ", "years ", "ago "};
        String[] strList2 = new String[]{"to ","be ", "or ", "not ", "to ", "be ", "hamlet "};

        List<String> stringList1 = new ArrayList<>(List.of(strList1));
        List<String> stringList2 = new ArrayList<>(List.of(strList2));

        System.out.println("stringList1 : ");
        System.out.print("before : ");
        stringList1.forEach(System.out::print);
        switchPairs(stringList1);
        System.out.print("after  : ");
        stringList1.forEach(System.out::print);


        System.out.print("\nstringList2 : ");
        System.out.print("before : ");
        stringList2.forEach(System.out::print);
        switchPairs(stringList2);
        System.out.print("after  : ");
        stringList2.forEach(System.out::print);

    }
}
