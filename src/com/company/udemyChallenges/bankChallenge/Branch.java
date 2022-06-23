package com.company.udemy.bankChallenge;

import java.util.ArrayList;


public class Branch {
    private static final ArrayList<Customer> CUSTOMERS = new ArrayList<>();
    private double totalAmountInBranch;
    private String branchName;

    public Branch(String branchName){
        this.branchName = branchName;
        totalAmountInBranch = getTotalBranchBalance();
    }

    public double getTotalBranchBalance(){
        double countBalance = 0;
        for(int i = 0; i<= CUSTOMERS.size()-1; i++){
            countBalance += CUSTOMERS.get(i).getBalance();
        }
        return countBalance;
    }

    public double getTotalAmountInBranch() {
        return totalAmountInBranch;
    }

    public void setTotalAmountInBranch(double totalAmountInBranch) {
        this.totalAmountInBranch = totalAmountInBranch;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void openNewCustomerAccount(Customer customer){
        if(findCustomer(customer) < 0){
            CUSTOMERS.add(customer);
            System.out.println(customer.getNameOfCustomer() + " added to branch");
        }else {
            System.out.println("Customer already exists");
        }
    }

    public void closeCustomerAccount(Customer customer){
        if(findCustomer(customer) > 0){
            CUSTOMERS.remove(customer);
            System.out.println("Account " + customer.getNameOfCustomer() + " closed");
        }
        System.out.println("Customer doesn't exists");

    }

    public boolean modifyCustomer(Customer customer, Customer newCustomer){
        int found = findCustomer(customer);
        if(found >= 0){
            CUSTOMERS.set(found, newCustomer);
            return true;
        }
        return false;
    }
    public boolean modifyCustomerName(String name, String newName){
        int found = findCustomer(name);
        if(found >= 0){
           CUSTOMERS.get(found).setNameOfCustomer(newName);
           return true;
        }
        return false;
    }
    public void getCustomer(int customerCount){
        if(CUSTOMERS.indexOf(customerCount) >= 0) {
            System.out.println(CUSTOMERS.get(customerCount).getNameOfCustomer() + "  " + CUSTOMERS.get(customerCount).getBalance());
        }else {
            System.out.println("Customer doesnt exist");
        }
    }

    private int findCustomer(Customer customer){
        int find = CUSTOMERS.indexOf(customer);
        return find;
    }
    private int findCustomer(String nameOfCustomer){
        for(int i = 0; i <= CUSTOMERS.size()-1; i++){

            if(CUSTOMERS.get(i).getNameOfCustomer() == nameOfCustomer){
                findCustomer(CUSTOMERS.get(i));
            }
        }
        return -1;
    }
}
