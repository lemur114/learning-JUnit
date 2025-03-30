package org.example;

public class BankAccount {
    private double balance;
    private double minimumBalance;
    private boolean is_active = true;
    private String holderName;


    public BankAccount(double minimumBalance, double balance) {
        this.minimumBalance = minimumBalance;
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount > minimumBalance) {
            balance -= amount;
        } else {
            throw new RuntimeException("Insufficient balance");
        }

    }
}
