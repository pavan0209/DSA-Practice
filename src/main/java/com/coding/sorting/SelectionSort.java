package com.coding.sorting;

import java.util.Arrays;

public class SelectionSort {
    static void sort(int[] arr) {
        int n = arr.length - 1;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }

            if (minIdx != i) {
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 22, 5, 23, 12, 56, 100};

        System.out.println("Before Sorting :: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting :: " + Arrays.toString(arr));
    }
}
