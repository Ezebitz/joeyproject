package tdd;

public class Account {
    private int balance;
    private String name;
    public void deposit(int amount) {
       if(amount >0) balance = amount + balance;
    }

    public int getBalance() {
        return balance;
    }
    public double withdraw(int cash){

        return balance;

    }
}

