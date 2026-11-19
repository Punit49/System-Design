package model;

import enums.AccountType;

public class BankAccount {
    static private int accountNumberCounter = 0;
    private static final double MIN_BALANCE = 100;
    private double balance = 0;
    private final int accountNumber;
    private AccountType accountType;

    public BankAccount(double balance, AccountType accountType) {
        if(!isValidBalance(balance)){
            throw new IllegalArgumentException("Minimum balance should be 100");
        }
        accountNumberCounter++;
        this.balance = balance;
        this.accountNumber = accountNumberCounter;
        this.accountType = accountType;
    }

    private boolean isValidBalance(double amount){
        return amount > 0;
    }

    public double getBalance(){
        return this.balance;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void deposit(double amount) throws Exception { 
        if(!isValidBalance(amount)){
            System.out.println("LOL");
            throw new IllegalArgumentException("Invalid amount");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception{
        if(amount > this.balance){
            throw new IllegalStateException("Insufficient balance.");
        } else if(this.balance - amount < MIN_BALANCE){
            throw new IllegalStateException("Minimum balance of " + MIN_BALANCE +  " must be maintained");
        }
        this.balance -= amount;
    }
}
