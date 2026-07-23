package com.coding.sorting;

import java.util.Arrays;

public class QuickSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int start, int end) {
        int pivotIdx = start - 1;
        int pivot = arr[end];
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                pivotIdx++;
                swap(arr, pivotIdx, i);
            }
        }
        pivotIdx++;
        swap(arr, pivotIdx, end);
        return pivotIdx;
    }

    static void quickSort(int[] arr, int start, int end) {

        if (start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 22, 5, 23, 12, 56, 100};

        System.out.println("Before Sorting :: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting :: " + Arrays.toString(arr));
    }
}
