package cscms88;

public class SavingAccount {
    private double balance;

    public SavingAccount(double d){
        balance = d;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double a){
        balance += a;
    }
    public void withdraw(double a){
        balance -= a;
    }
}
