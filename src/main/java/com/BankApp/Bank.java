package com.BankApp;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account>accounts=new ArrayList<>();
    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account created Successfully!");
    }
    public Account findAccount(int accNumber){
        for(Account account : accounts){
            if(account.getAccNumber()==accNumber){
                return account;
            }
        }
        return null;
    }
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No Accounts available");
            return;
        }
        for (Account account : accounts) {
            account.displayAccountDetails();
        }
        System.out.println("---------------------------------");
    }

}
