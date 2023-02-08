package com.data.structure.queue;


public class MyQueue<T> {

    private Node first;
    private Node last;
    private int length;

    public MyQueue(T value){
        Node node=new Node(value);
        first=node;
        last=node;
        length=1;
    }

    public void enqueue(T value){
        Node node=new Node(value);
        if (length==0){
            first=node;
            last=node;
        }else {
            last.next=node;
            last=node;
        }
        length++;
    }

    public Node dequeue(){
        if (length==0) return null;
        Node temp=first;
        if(length==1){
            first=null;
            last=null;
        }else {
            first=temp.next;
            temp.next=null;
        }
        length--;
        return temp;
    }

    public void printQueue(){
        Node temp=first;
        while (temp !=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void getFirst(){
        System.out.println("First: "+first.getValue());
    }

    public void getLast(){
        System.out.println("Last: "+last.getValue());
    }

    public void getLength(){
        System.out.println("Length: "+length);
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
