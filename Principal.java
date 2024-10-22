package BankAccountSynchronized;

public class Principal {
    public static void main(String[] args) {
        
        BankAccount bankAccount = new BankAccount(0);

        BankThreadSave[] btsave = new BankThreadSave[20];
        BankThreadSpend[] btspend = new BankThreadSpend[20];

        for(int i = 0; i<20; i++){
            btsave[i]=new BankThreadSave(bankAccount);
            btspend[i]=new BankThreadSpend(bankAccount);
            
             btsave[i].start();
             System.out.println(bankAccount.getBalance());
             btspend[i].start();
             System.out.println(bankAccount.getBalance());

        }

        
    }
    
}