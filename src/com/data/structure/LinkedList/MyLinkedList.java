package com.data.structure.LinkedList;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList(int value){
        Node node=new Node(value);
        head=node;
        tail=node;
        length=1;
    }

    public void printList(){
        Node temp=head;
        while (temp !=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void append(int value){
        Node node=new Node(value);
        if(length==0){
            head=node;
            tail=node;
        }else {
            tail.next=node;
            tail=node;
        }
        length++;
    }

    public void prepend(int value){
        Node node=new Node(value);
        if (length==0){
            head=node;
            tail=node;
        }else{
            node.next=head;
            head=node;
        }
        length++;
    }

    public void removeLast(){
        if (length==0) return;
        Node temp=head;
        Node pre=head;
        while (temp.next !=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if (length==0){
            head=null;
            tail=null;
        }
    }

    public Node removeFirst(){
        if (length==0) return null;
        Node temp=head;
        head=temp.next;
        temp.next=null;
        length--;
        if(length==0)
            tail=null;
        return temp;
    }

    public int getLength() {
        return length;
    }

    private class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value=value;
        }
    }

}
