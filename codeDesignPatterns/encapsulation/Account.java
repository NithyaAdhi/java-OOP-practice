package codeDesignPatterns.encapsulation;

public class Account {

    //encapsulation
   private float balance;

   public void deposit(float amount){
       if(amount > 0)
         balance += amount;
   }

    public void withdraw(float amount){
        if(amount > 0)
            balance -= amount;
    }

    public float getBalance() {
        return balance;
    }


}
