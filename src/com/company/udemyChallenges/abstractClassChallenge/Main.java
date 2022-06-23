package com.company.udemy.abstractClassChallenge;

public class Main {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        int j = nums.length-1;
        int[] newArray = new int[2];
        for(int i = 0; i<j; i++, j--){
            if(nums[i] + nums[j] == target){
                newArray[0] = nums[i];
                newArray[1] = nums[j];

            }else if(nums[i] + nums[j] > target){
                i--;
            }else if(nums[i] + nums[j] < target){
                j++;
            }
        }
        return newArray;
    }
}
