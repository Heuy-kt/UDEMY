package com.company.udemyChallenges.abstractClassChallenge;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root){
        this.root = root;
    }
    @Override
    public ListItem getRoot() {
        return this.root;
    }
    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            this.root = newItem;
            System.out.println("added " + newItem.getValue() + " to the Root");
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.comparedTo(newItem);
            if(comparison < 0){
                //newItem is greater, move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    //currentItem.setNext(newItem);
                    //newItem.setPrevious(currentItem); replacing these with shorter codes
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    System.out.println("added " + newItem.getValue() + " to the right");
                    return true;
                }
                return true;
            } else if(comparison > 0){

                // means current item is bigger than the new item
                if(currentItem.previous() != null){

                    //newItem.setPrevious(currentItem.previous());
                    //currentItem.previous().setNext(newItem); replacing with shorter codes
                    newItem.setPrevious(currentItem.previous()).setNext(newItem);
                    //newItem.setNext(currentItem);
                    //currentItem.setPrevious(newItem); replacing with shorter codes
                    newItem.setNext(currentItem).setPrevious(newItem);
                    System.out.println("added " + newItem.getValue() + " to the right of " + currentItem.getValue() +
                            " and set to one another");
                }else{
                    //node without previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;

                }
                return true;
            }else{

                System.out.println("Object already exists");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = this.root;
        while(item != null) {
            int comparison = currentItem.comparedTo(item);
            if (comparison == 0){
                if(currentItem == this.root){
                    this.root = currentItem.next();
                    return true;
                }else{
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if (comparison < 0) {
                currentItem = currentItem.next();
            }else{
                System.out.println("Item doesn't even exists");
                return false;
            }
        }
        System.out.println("Item doesn't even exists");
        return false;
    }

    @Override
    public void traverse(ListItem current) {
        if(current == null){
            System.out.println("This list is empty");

        }else{
            while(current != null){
                System.out.println(current.getValue());
                current = current.next();
            }
        }
    }

//    public void traverseRecursively(ListItem root) {
//        if (root != null) {
//            System.out.println(root.getValue());
//            traverseRecursively(root.next());
//        }
//    }
}
