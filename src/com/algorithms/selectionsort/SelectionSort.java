package com.algorithms.selectionsort;

import java.util.Arrays;

/*
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 5, 1, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
