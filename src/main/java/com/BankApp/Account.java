package com.BankApp;

public abstract class Account {
   private int accNumber;
   private String accHolderName;
   private double balance;
   public Account(int accNumber,String accHolderName,double balance){
       this.accNumber=accNumber;
       this.accHolderName=accHolderName;
       this.balance=balance;
   }
   public int getAccNumber(){
       return accNumber;
   }
   public String getAccHolderName(){
       return accHolderName;
   }
   public double getBalance(){
       return balance;
   }
   public void setAccNumber(int accNumber){
       this.accNumber=accNumber;
   }
   public void setAccHolderName(String accHolderName){
       this.accHolderName=accHolderName;
   }
   public void setBalance(double balance){
       this.balance=balance;
   }

   public abstract void withdraw(double amount);

   public void deposit(double amount){
       balance+=amount;
       System.out.println("Deposited :"+amount);
   }

   public void displayAccountDetails(){
       System.out.println("AccountNumber :"+accNumber);
       System.out.println("AccHolderNumber :"+accHolderName);
       System.out.println("Balance :"+balance);
   }
}
