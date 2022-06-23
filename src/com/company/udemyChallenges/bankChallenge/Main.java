package com.company.udemyChallenges.bankChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Adegoke Ajoke", 46900.56);
        Branch branch = new Branch("Unilag branch");
        Bank bank = new Bank("Guarantee Trust Bank");
        bank.addBranchToBank(branch);
        branch.openNewCustomerAccount(customer);

        branch.getCustomer(1);
    }
    public static void printAllBranches(Bank bank){
        ArrayList<Branch> newBranch = bank.getAllBranches();
        for(int i = 0; i<= newBranch.size()-1; i++){
            System.out.println(i+1 + ". " + bank.getBranch(i).getBranchName());
        }
    }
}
