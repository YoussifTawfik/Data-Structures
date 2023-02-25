package com.data.structure.recursion;

import java.util.Scanner;

public class Main {

    /*
    * Recursion:
    * The method that call itself until it doesn't.
    * */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int value=scanner.nextInt();
        int result= factorial(value);
        System.out.println("Factorial of: "+ value+" is: "+ result);

        int sumValue=scanner.nextInt();
        int sumResult= sumWithoutLoop(sumValue);
        System.out.print("Sum of: "+ sumValue+" is: "+ sumResult);
    }

    public static int factorial(int n){
        if (n==1) return 1;
        return n* factorial(n-1);
    }

    public static int sumWithoutLoop(int n){
        if (n==1) return 1;
        return n+sumWithoutLoop(n-1);
    }
}
