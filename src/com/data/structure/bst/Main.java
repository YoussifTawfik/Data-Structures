package com.data.structure.bst;

public class Main {



    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(30);
        bst.insert(27);
        bst.insert(43);
        bst.insert(19);
        bst.insert(29);
        bst.insert(35);
        bst.insert(50);

        System.out.println(bst.root.right.left.getValue());  // 35

        System.out.println("Contains: "+bst.contains(17));
    }
}
