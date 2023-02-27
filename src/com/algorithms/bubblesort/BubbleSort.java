package com.algorithms.bubblesort;

import java.util.Arrays;

/*
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr={4,2,6,5,1,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int [] arr){
        for(int i=arr.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
