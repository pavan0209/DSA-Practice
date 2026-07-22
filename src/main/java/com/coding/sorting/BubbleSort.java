package com.coding.sorting;

import java.util.Arrays;

public class BubbleSort {

    static void sort(int[] arr) {
        int n = arr.length - 1;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 22, 5, 23, 12, 56, 100};

        System.out.println("Before Sorting :: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting :: " + Arrays.toString(arr));
    }
}
