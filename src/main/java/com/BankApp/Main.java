package com.BankApp;

import java.util.Scanner;
public class Main {
    public static void main(String []args){
        System.out.println("-------------------------------");
        System.out.println("Welcome to the Bank Application");
        System.out.println("-------------------------------");
                Scanner sc = new Scanner(System.in);

                Bank bank = new Bank();

                SavingsAccount s1 =
                        new SavingsAccount(1001, "Sushmitha", 8000);

                bank.addAccount(s1);

                while (true) {

                    System.out.println("\n===== BANK MENU =====");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. View Account");
                    System.out.println("4. Exit");

                    System.out.print("Enter choice: ");
                    int choice = sc.nextInt();

                    switch (choice) {

                        case 1:
                            System.out.print("Enter Deposit Amount: ");
                            double depositAmount = sc.nextDouble();

                            s1.deposit(depositAmount);
                            break;

                        case 2:
                            System.out.print("Enter Withdraw Amount: ");
                            double withdrawAmount = sc.nextDouble();

                            s1.withdraw(withdrawAmount);
                            break;

                        case 3:
                            s1.displayAccountDetails();
                            break;

                        case 4:
                            System.out.println("Thank You!");
                            System.exit(0);

                        default:
                            System.out.println("Invalid Choice!");
                    }
                }
    }
}




