package tdd;



public class AccountTwo {
    private double amt;
    private double balance;
    private int pin;
    private int cash;

    public AccountTwo(double balance, int pin) {
        this.pin = pin;
        this.balance = balance;


    }

    public AccountTwo() {
        
    }

    public void withDraw(double amt, int pin) {
        if (pin == pin) {
            balance = balance - amt;
        } else if (pin != pin) {
            System.out.println("invalid input");
        }

    }

    public void depositor(double cash , int pin) {
        if (pin == pin) {

            balance = balance + cash;
        } else
            System.out.println(("invalid account"));
    }



    public double getBalance() {
        return balance;
    }



}