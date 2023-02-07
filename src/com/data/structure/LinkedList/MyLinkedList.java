package com.data.structure.LinkedList;

public class MyLinkedList<T> {

    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList(T value){
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

    public void append(T value){
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

    public void prepend(T value){
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

    public Node remove(int index){
        if(index<0 || index >= length) return null;
        if(index ==0) removeFirst();
        if(index == length-1) removeLast();
        Node prev=get(index-1);
        Node temp=prev.next;
        prev.next=temp.next;
        temp.next=null;
        length--;
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >=length) return null;
        Node temp=head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }
        return temp;
    }

    public boolean set(int index, T value){
        Node temp=get(index);
        if (temp!=null){
            temp.value=value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, T value){
        if (index<0 || index>=length) return false;
        if(index==0){
            prepend(value);
        }
        if(index==length){
            append(value);
        }
        Node node=new Node(value);
        Node temp=get(index-1);
        node.next=temp.next;
        temp.next=node;
        length++;
        return true;
    }


    public void reverse(){
        // firstly: reverse head and tail
        Node temp=head;
        head=tail;
        tail=temp;
        // use after and before node to revert node direction
        Node after;
        Node before=null;
        for(int i=0; i<length; i++){
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }

    public int getLength() {
        return length;
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
