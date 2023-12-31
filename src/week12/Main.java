package week12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    static void switchPairs(List<String> stringList){

        // max limit of the loop
        int limit = stringList.size() - ((stringList.size() % 2 == 0) ? 0 : 1);

        for (int i = 0; i < limit; i+=2){
            if (stringList.get(i+1) != null){
                String temp = stringList.get(i+1);
                stringList.set(i+1, stringList.get(i));
                stringList.set(i, temp);
            }
        }
    }
    static void removeBadPairs(List<Integer> integerList){

        if (integerList.size() % 2 != 0)
            integerList.removeLast();

        // this is because the "integerList.size()" can't be modified
        int limit = integerList.size();

        for (int i = 0; i < limit; i+=2){

            if (integerList.get(i) > integerList.get(i+1)){
                integerList.remove(i+1);
                integerList.remove(i);
                i-=2;
                limit-=2;
            }

        }
    }

    // this methode is just for printing lists of strings in order to reduce
    // the amount of code in the main method
    static void printStringList(List<String> stringList, String str){
        System.out.print("- " + str + (str.equals("After")?" ": "") + " : ");
        stringList.stream()
                .map(e -> e + "  ")
                .forEach(System.out::print);

        System.out.print('\n');
    }

    public static void main(String[] args) {

        System.out.println("##########  Bank Accounts \n");

        BankAccount a1 = new BankAccount(1, "Ahmed", 1500);
        BankAccount a2 = new BankAccount(3, "Zaynab", 3850);
        BankAccount a3 = new BankAccount(2, "John", 4500);
        BankAccount a4 = new BankAccount(4, "Ali", 1760);

        List<BankAccount> myAccounts = new ArrayList<>(List.of(a1,a2,a3,a4));
        BankAccount temp;

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


        System.out.println("\n\n##########  Switch pairs");

        List<String> stringList1 = new ArrayList<>(List.of("four","score", "and", "seven", "years", "ago"));
        List<String> stringList2 = new ArrayList<>(List.of("to","be", "or", "not", "to", "be", "hamlet"));

        System.out.println("stringList1 : ");
        printStringList(stringList1, "Before");
        switchPairs(stringList1);
        printStringList(stringList1, "After");


        System.out.println("stringList2 : ");
        printStringList(stringList2, "Before");
        switchPairs(stringList2);
        printStringList(stringList2, "After");

        List<Integer> integerList1 = new ArrayList<>(List.of( 3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1));
        List<Integer> integerList2 = new ArrayList<>(List.of( 3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1, 5, 6, 8));

        System.out.print("\n\nIntegerList1 : ");
        System.out.print("\nbefore : " + integerList1);
        removeBadPairs(integerList1);
        System.out.print("\nafter  : " + integerList1);

        System.out.print("\n\nIntegerList2 : ");
        System.out.print("\nbefore : " + integerList2);
        removeBadPairs(integerList2);
        System.out.print("\nafter  : " + integerList2);

    }
}
