package com.company.udemyChallenges.bankChallenge;

import java.util.ArrayList;

public class Bank {
    private static final ArrayList<Branch> branches = new ArrayList<>();
    private String bankName;

    public Bank(String bankName){
        this.bankName = bankName;
    }

    public void addBranchToBank(Branch branch){
        if(findBranch(branch) < 0){
            branches.add(branch);
        }
        System.out.println(branch + "already exists");
    }

    public void removeBranch(Branch branch){
        int found = findBranch(branch);
        if(found >= 0){
            branches.remove(branch);
        }else{
            System.out.println("Branch doesn't exists");
        }
    }

    public void removeBranch(String branchName){
        int found = findBranch(branchName);
        Branch branch = branches.get(found);
        removeBranch(branch);
    }

    private int findBranch(Branch branch){
        int find = branches.indexOf(branch);
        return find;
    }

    private int findBranch(String branchName){
        for(int i = 0; i <= branches.size()-1; i++){

            if(branches.get(i).getBranchName() == branchName){
                findBranch(branches.get(i));
            }
        }
        return -1;
    }
    public ArrayList<Branch> getAllBranches(){
        return branches;
    }

    public Branch getBranch(String branchName){
        int found = findBranch(branchName);
        Branch branch = branches.get(found);
        return branch;
    }
    public Branch getBranch(int branchIndex){
        if(branches.get(branchIndex) != null){
            Branch branch = branches.get(branchIndex);
            return branch;
        }
        return null;
    }
}
