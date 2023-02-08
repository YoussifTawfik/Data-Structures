package com.data.structure.linkedlist;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList=new MyLinkedList<>(5);
        /*
        * Test append method
        * */
        myLinkedList.append(7);
        myLinkedList.printList();

        /*
         * Test removeLast method
         * */
        myLinkedList.append(13);
        myLinkedList.removeLast();
        myLinkedList.printList();

        /*
         * Test prepend method
         * */
        myLinkedList.prepend(10);
        myLinkedList.printList();

        /*
         * Test get method
         * */
        System.out.println("Get by index: "+myLinkedList.get(1).getValue());

        /*
         * Test set method
         * */
        myLinkedList.set(1,20);
        System.out.println("Get by index: "+myLinkedList.get(1).getValue());
        myLinkedList.insert(1,23);
        myLinkedList.printList();

        /*
        * Test Remove Method
        * */
        myLinkedList.append(10);
        myLinkedList.append(17);
        System.out.println("Before: ");
        myLinkedList.printList();
        myLinkedList.remove(1);
        System.out.println("After: ");
        myLinkedList.printList();


        /*
         * Test Reverse Method
         * */
        myLinkedList.append(10);
        myLinkedList.append(12);
        myLinkedList.append(17);
        System.out.println("Before: ");
        myLinkedList.printList();
        myLinkedList.reverse();
        System.out.println("After: ");
        myLinkedList.printList();


    }
}
