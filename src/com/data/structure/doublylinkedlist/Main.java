package com.data.structure.doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        MyDoublyLinkedList myDoublyLinkedList=new MyDoublyLinkedList(5);
        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();

        /*
        * Append Method
        * */
        System.out.println("===================== Append Method =================");
        myDoublyLinkedList.append(7);
        myDoublyLinkedList.getTail();

        /*
         * RemoveLast Method
         * */
        System.out.println("===================== RemoveLast Method =================");
        myDoublyLinkedList.removeLast();
        myDoublyLinkedList.getTail();

        /*
         * Prepend Method
         * */
        System.out.println("===================== Prepend Method =================");
        myDoublyLinkedList.getHead();
        myDoublyLinkedList.prepend(10);
        myDoublyLinkedList.getHead();

        /*
         * RemoveFirst Method
         * */
        System.out.println("===================== RemoveFirst Method =================");
        myDoublyLinkedList.getHead();
        myDoublyLinkedList.removeFirst();
        myDoublyLinkedList.getHead();

        /*
         * Get Method
         * */
        System.out.println("===================== Get Method =================");
        myDoublyLinkedList.append(7);
        myDoublyLinkedList.append(12);
        myDoublyLinkedList.append(15);
        myDoublyLinkedList.append(20);
        myDoublyLinkedList.printList();
        System.out.println(myDoublyLinkedList.get(3).value);

        /*
         * Set Method
         * */
        System.out.println("===================== Set Method =================");
        myDoublyLinkedList.set(2,33);
        myDoublyLinkedList.printList();

        /*
         * Insert Method
         * */
        System.out.println("===================== Insert Method =================");
        myDoublyLinkedList.insert(2,8);
        myDoublyLinkedList.printList();
    }
}
