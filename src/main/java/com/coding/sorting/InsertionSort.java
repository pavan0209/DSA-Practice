package com.coding.sorting;

import java.util.Arrays;

public class InsertionSort {

    static void sort(int[] arr) {
        int n = arr.length - 1;

        for (int i = 1; i < n; i++) {
            int val = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = val;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 22, 5, 23, 12, 56, 100};

        System.out.println("Before Sorting :: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting :: " + Arrays.toString(arr));
    }


}
