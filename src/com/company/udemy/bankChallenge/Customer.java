package com.company.udemy.bankChallenge;

import java.util.ArrayList;

public class Customer {

    private String nameOfCustomer;
    private static final ArrayList<Double> TRANSACTIONS = new ArrayList<>();
    private double balance;

    public Customer(String nameOfCustomer, double initialBalance){
        this.nameOfCustomer = nameOfCustomer;
        this.balance = initialBalance;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public ArrayList<Double> getAllTransactions() {
        return TRANSACTIONS;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void creditAccount(Double amount){
        this.balance += amount;
        TRANSACTIONS.add(amount);
    }

    public void debitAccount(Double amount){
        this.balance -= amount;
        TRANSACTIONS.add(-amount);
    }
}
