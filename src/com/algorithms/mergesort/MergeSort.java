package com.algorithms.mergesort;

import java.util.Arrays;


/*
* Time Complexity: O(n log n)
* Space Complexity: O(n)
* */
public class MergeSort {

    public static void main(String[] args) {
        int [] arr1={1, 3 , 7, 8, 2, 4 , 5, 6};
        //int [] arr2={};
        System.out.println(Arrays.toString((mergeSort(arr1))));
    }

    private static int[] mergeSort(int [] arr){
        if(arr.length==1) return arr;
        int midIndex=arr.length/2;
        int [] left=mergeSort(Arrays.copyOfRange(arr, 0, midIndex));
        int [] right= mergeSort(Arrays.copyOfRange(arr, midIndex, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int [] arr1, int [] arr2){
        int i=0, j=0, index=0;
        int [] combined= new int[arr1.length+arr2.length];
        while (i< arr1.length && j< arr2.length){
            if(arr1[i]< arr2[j]){
                combined[index] = arr1[i];
                i++;
                index++;
            }else {
                combined[index]=arr2[j];
                j++;
                index++;
            }
        }
        while (i<arr1.length){
            combined[index]= arr1[i];
            index++;
            i++;
        }
        while (j< arr2.length){
            combined[index]= arr2[j];
            index++;
            j++;
        }
        return combined;
    }
}
