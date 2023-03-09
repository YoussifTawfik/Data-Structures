package com.data.structure.doublylinkedlist;

public class MyDoublyLinkedList<T> {

    private Node head;
    private Node tail;
    private int length;

    public MyDoublyLinkedList(T data) {
        Node node = new Node(data);
        head = node;
        tail = node;
        length = 1;
    }

    public Node remove(int index){
        if (index<0 || index>= length) return null;
        if (index==0)
            return removeFirst();
        if (index==length-1)
            return removeLast();
        Node temp=get(index);
        Node before=temp.prev;
        Node after=temp.next;
        before.next=after;
        after.prev=before;
        temp.next=null;
        temp.prev=null;
        length--;
        return temp;
    }
    public boolean insert(int index, T value){
        if (index<0 || index>= length) return false;
        if (index==0){
            prepend(value);
            return true;
        }
        if(index== length-1){
            append(value);
            return true;
        }
        Node node=new Node(value);
        Node before=get(index-1);
        Node after=before.next;
        node.prev=before;
        node.next=after;
        before.next=node;
        after.prev=node;
        length++;
        return true;
    }

    public boolean set(int index, T value){
        Node temp=get(index);
        if(temp !=null){
            temp.value=value;
            return true;
        }
        return false;
    }

    public Node get(int index){
        if (index <0 || index>= length) return null;
        Node temp=head;
        if(index< length/2){
            for(int i=0; i<index; i++)
                temp=temp.next;
        }else {
            temp=tail;
            for(int i=length-1; i>index; i--){
                temp=temp.prev;
            }
        }
        return temp;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head=head.next;
            temp.next=null;
            head.prev=null;
        }
        length--;
        return temp;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void append(T data) {
        Node node = new Node(data);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        length++;
    }

    public void prepend(T data){
        Node node=new Node(data);
        if (length ==0){
            head=node;
            tail=node;
        }else{
            head.prev=node;
            node.next=head;
            head=node;
        }
        length++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }


    protected class Node {
        Node next;
        Node prev;
        protected T value;

        public Node(T value) {
            this.value = value;
        }
    }
}
