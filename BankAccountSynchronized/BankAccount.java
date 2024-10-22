package BankAccountSynchronized;


public class BankAccount {
    int balance = 0;

    BankAccount (int balance){
        this.balance=balance;
    }

    public void addMoney(int money){
        balance += money;
    }

    public void takeOutMoney(int money){
        balance -= money;
    }

    public int getBalance(){
        return balance;
    }
}
