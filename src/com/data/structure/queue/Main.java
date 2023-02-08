package com.data.structure.queue;

public class Main {

    public static void main(String[] args) {
        MyQueue<Integer> myQueue=new MyQueue<>(4);
        myQueue.getLength();
        myQueue.getFirst();
        myQueue.getLast();

        /*
         * Test enqueue method
         * */
        System.out.println("================= Enqueue Method ===================");
        myQueue.enqueue(7);
        myQueue.enqueue(12);
        myQueue.printQueue();

        /*
         * Test dequeue method
         * */
        System.out.println("================= Dequeue Method ===================");
        myQueue.dequeue();
        myQueue.getFirst();
        myQueue.printQueue();
    }
}
