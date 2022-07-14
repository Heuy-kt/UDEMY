package com.company.practice.sets;

import java.io.StringBufferInputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i = 1; i <= 100; i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }
//        System.out.println("squares in " + squares.size());
//        System.out.println("squares in " + cubes.size());

        Set<Integer> unions = new HashSet<>(squares);
        unions.addAll(cubes);
//        System.out.println("squares in " + unions.size());

        Set<Integer> intersection = new HashSet<>(cubes);
        intersection.retainAll(squares);
//        System.out.println("squares in " + intersection.size());

        Set<String> words = new HashSet<>();
        String sentence = "One day in the year of the fox";
        String[] arrayWord = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWord));

        for(String s: words){
//            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "is", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("Nature - Divine: ");
        Set<String> diff1 = new HashSet<>(nature); //union - intersection
        diff1.removeAll(divine);
        System.out.println(diff1);

        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        System.out.println(diff2);


    }
}
















