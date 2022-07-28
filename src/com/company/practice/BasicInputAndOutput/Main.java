package com.company.practice.BasicInputAndOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(divideEAFP(2,0));
        int x = getInt();
        System.out.println("X is " +x);
    }
    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int getIntLBYL(){
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        return scanner.nextInt();
    }
    private static int divideLBYL(int x, int y){
//        testing to not get an erro, look beofre you leap
        if(y != 0){
            return x/y;
        }
        return 0;
    }

    private static int divideEAFP(int x, int y){
        //easy to ask for forgiveness and permission
        try{
            return x/y;
        }catch (Exception e){
            return 0;
        }
    }
}
