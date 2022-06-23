package com.company.udemyChallenges.abstractClassChallenge;

public class SearchTree implements NodeList{
    private ListItem root = null;
    /*
    * Using this searchtree class using recursive methods,
    * it would broaden my knowledge on implementing binary search trees
    * */

    public SearchTree(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
       if(this.root == null){
           //Tree is empty, new Item automatically takes root of tree;
           this.root = newItem;
           return true;
       }
       //otherwise, we start comparing from head of the tree

        ListItem currentItem = this.root;
       while(currentItem != null){
            int comparison = currentItem.comparedTo(newItem);
            if(comparison < 0){
                //newItem is greater move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    //no node on thr right, so add new item
                    currentItem.setNext(newItem);
                    return true;
                }
            }else if(comparison > 0){
                // new item is lesser. move left if possible
                if(currentItem.previous() != null){
                    currentItem = currentItem.previous();
                }else{
//                    no node on the left, add at this point
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }else{
                //these guys are simply equal do nothing
                System.out.println(newItem.getValue() + " already exists, so not adding");
                return false;
            }
       }
       return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting " + item.getValue());
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while(currentItem != null){
            int comparison = (currentItem.comparedTo(item));
            if(comparison < 0){
                parentItem = currentItem;
                currentItem = currentItem.next();
            }else if(comparison > 0){
                parentItem = currentItem;
                currentItem = currentItem.previous();

            }else{
                //its equal, item has being found, so remove the item
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent){
        // remove item from tree
        if(item.next() == null){
            //means no right tree, make parent point to left, make parent point to left tree (which might be null)
        if(parent.next() == item){
            parent.setNext(parent.previous());
        }

        }
    }
    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
