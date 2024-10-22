package BankAccountSynchronized;

public class BankThreadSpend extends Thread{

    BankAccount bankAccount;

    public void run(){
        for(int i = 0; i<= 5; i++){
            bankAccount.addMoney(100);
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
