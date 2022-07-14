package com.company.practice.sets;

public class DogMain {
    public static void main(String[] args) {
        Labrado rover = new Labrado("Rover");
        Dog rover2 = new Dog("Rover");
        System.out.println(rover.equals(rover2));
        System.out.println(rover2.equals(rover));

    }
}
