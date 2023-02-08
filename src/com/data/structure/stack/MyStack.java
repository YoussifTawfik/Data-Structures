package com.data.structure.stack;

public class MyStack<T> {

    private Node top;
    private int height;

    public MyStack(T value){
        Node node=new Node(value);
        top=node;
        height=1;
    }

    public void push(T value){
        Node node=new Node(value);
        if (height==0){
            top=node;
        }else {
            node.next=top;
            top=node;
        }
        height++;
    }

    public Node pop(){
        if (height==0) return null;
        Node temp=top;
        top=top.next;
        temp.next=null;
        height--;
        return temp;
    }

    public void printStack(){
        Node temp=top;
        while (temp !=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void getTop(){
        System.out.println("Top: "+top.getValue());
    }

    public void getHeight(){
        System.out.println("Height: "+height);
    }

    class Node{
        private T value;
        private Node next;

        Node(T value){
            this.value=value;
        }

        public T getValue(){
            return value;
        }
    }
}
