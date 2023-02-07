package com.data.structure.LinkedList;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList=new MyLinkedList(5);
//        System.out.println("Length is: "+myLinkedList.getLength());
//        myLinkedList.printList();
//
//        myLinkedList.append(7);
//        System.out.println("Length is: "+myLinkedList.getLength());
//        myLinkedList.printList();
//
//        System.out.println("Remove last:");
//        myLinkedList.removeLast();
//        System.out.println("Length is: "+myLinkedList.getLength());
//        myLinkedList.printList();

//        myLinkedList.removeLast();
//        System.out.println(myLinkedList.getLength());
//        myLinkedList.removeLast();
//        myLinkedList.printList();

        //myLinkedList.removeLast();
        //myLinkedList.prepend(10);
        myLinkedList.append(10);
        myLinkedList.append(7);
        System.out.println("Get by index: "+myLinkedList.get(1).getValue());
        myLinkedList.set(1,20);
        System.out.println("Get by index: "+myLinkedList.get(1).getValue());
        myLinkedList.insert(1,23);
        myLinkedList.printList();

    }
}
