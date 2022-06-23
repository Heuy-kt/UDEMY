package com.company.udemyChallenges.abstractClassChallenge;

public class Main {
    public static void main(String[] args) {
        MyLinkedList tree = new MyLinkedList(null);
//        System.out.println("Farooq".compareTo("went"));

//        String StringData = "2 4 1 6 9 0 5 7 8 3 3";
        String StringData = "Ondo Lagos Oyo Ogun Kwara Nassarawa Kaduna Benue Oyo Kano";
        String[] data = StringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
    }
}
