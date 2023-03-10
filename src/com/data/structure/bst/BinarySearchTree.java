package com.data.structure.bst;


public class BinarySearchTree {

    Node root;

    public boolean insert(int value){
        Node node=new Node(value);
        if (root== null){
            root=node;
            return true;
        }
        Node temp=root;
        while (true){
            if (node.value == temp.value) return false;
            if (node.value < temp.value){
                if (temp.left == null){
                    temp.left=node;
                    return true;
                }
                temp=temp.left;
            }else {
                if (temp.right == null){
                    temp.right=node;
                    return true;
                }
                temp=temp.right;
            }
        }
    }

    public boolean contains(int value){
        Node temp=root;
        while (temp != null){
            if (temp.value==value) return true;
            if (value < temp.value)
                temp=temp.left;
            else
                temp=temp.right;
        }
        return false;
    }

    class Node{
        private int value;
        Node left;
        Node right;

        Node(int value){
            this.value=value;
        }

        public int getValue(){
            return value;
        }
    }

}
