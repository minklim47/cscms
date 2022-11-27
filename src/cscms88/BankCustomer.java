package cscms88;

//import java.util.ArrayList;

import java.util.ArrayList;

public class BankCustomer extends Customer {
    private ArrayList<SavingAccount> acc = new ArrayList<>();

    public BankCustomer(String name, int age){
        super(name,age);
    }
    public void AddAccount(SavingAccount a){
        acc.add(a);
    }
    public double getTotalBalance(){
        double sum = 0;
        for (SavingAccount account : acc){
            sum += account.getBalance();
        }
        return sum;
    }
}
