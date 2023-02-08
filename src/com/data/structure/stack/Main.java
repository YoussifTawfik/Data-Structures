package com.data.structure.stack;

public class Main {

    public static void main(String[] args) {
        MyStack<Integer> myStack=new MyStack<>(3);
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();

        /*
        * Test push method
        * */
        myStack.push(7);
        myStack.push(10);
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();


        /*
         * Test pop method
         * */
        myStack.pop();
        myStack.getTop();
    }
}
