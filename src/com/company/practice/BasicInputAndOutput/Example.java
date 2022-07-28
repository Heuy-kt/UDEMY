package com.company.practice.BasicInputAndOutput;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            int result = divide();
            System.out.println(result);
        }catch(NoSuchElementException | ArithmeticException e ){
            System.out.println(e.toString());
            System.out.println("Unable to perform division, Autopilot shutting down");
        }

    }
    private static int divide(){
        int x,y;
        try {
            x = getInt();
            y = getInt();
            System.out.println("X is: " + x + " and Y is: " + y);
            return x/y;
        }catch (NoSuchElementException e){
            throw new NoSuchElementException("no suitable input");
        }catch (ArithmeticException e){
            throw new ArithmeticException("Attempt to divide by 0");
        }

    }
    private static int getInt(){

        System.out.print("enter: ");
        while(true){
            try {
                return scanner.nextInt();
            }catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("kindly enter a number from 0 to 9");
            }
        }
    }
}
