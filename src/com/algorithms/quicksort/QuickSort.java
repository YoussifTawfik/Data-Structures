package com.algorithms.quicksort;

import java.util.Arrays;

/*
 * Time Complexity: O(n log n) -----> Random Data
 * Time Complexity: O(n^2) -----> Sorted Data
 * Space Complexity: O(1)
 * */
public class QuickSort {

    public static void main(String[] args) {

        int[] array = {4, 6, 1, 7, 3, 2, 5};
        System.out.println("Pivot: " + pivot(array, 0, array.length - 1));
        quickSortHelper(array);
        System.out.println(Arrays.toString(array));

    }

    public static void quickSortHelper(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }


    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
