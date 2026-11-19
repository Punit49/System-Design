package model;

import enums.AccountType;

public class BankAccount {
    private static int accountNumberCounter = 0;
    private final static double MIN_BALANCE = 100;
    private final int accountNumber; 
    private double balance;
    private AccountType accountType;

    public BankAccount(double balance, AccountType accountType) {
        if(balance < MIN_BALANCE){
            throw new IllegalArgumentException("Minimum balance should be 100");
        }
        accountNumberCounter++;
        this.accountNumber = accountNumberCounter;
        this.balance = balance;
        this.accountType = accountType;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    // won't work 
    // public void setAccountNumber(int number){
    //     this.accountNumber = number;
    // }

    public void deposit(double amount) {
        if(amount <= 0){
            throw new IllegalArgumentException("Invalid amount. Amount must be greater than 0.");
        } 
        this.balance += amount;
    }

    public void withDraw(double amount){
        if(amount > balance){
            throw new IllegalStateException("Insufficient balance.");
        } else if(this.balance - amount < MIN_BALANCE){
            throw new IllegalArgumentException("Minimum balance of " + MIN_BALANCE + " must be maintained.");
        }
        this.balance -= amount;
    }
}
