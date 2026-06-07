package com.BankApp;

public class CurrentAccount extends Account{

    private double overDraftLimit=5000;

    public CurrentAccount(int accNumber, String accHolderName, double balance) {
        super(accNumber, accHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=getBalance()+overDraftLimit){
            setBalance(getBalance()-amount);
            System.out.println("withdraw successfull");
        }else{
            System.out.println("overdraft limit exceeded");
        }
    }
}
