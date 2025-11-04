package Encapsulation;

public class Player {
      private long balance;
      private int account;

      // to access private variables outside the class we use getter setter for each variable


    public int getAccount() {
        return this.account;
    }
    public void setAccount(int account){
        this.account = account;
    }

    // balance getter and setter
    public long getBalance(){
        return this.balance;
    }
    public void setBalance(long balance){
        this.balance = balance;
    }
    public void printBalance(){
          System.out.println("your balance is " + this.account);
      }
}
