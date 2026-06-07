package com.BankApp;

public class SavingsAccount extends Account {

    public SavingsAccount(int accNumber, String accHolderName, double balance) {
        super(accNumber, accHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("withdrawn:" + amount);
        }
        else{
            System.out.println("Insufficient balance!");
        }
    }
}
