package com.coding.sorting;

import java.util.Arrays;

public class MergeSort {

    static void sort(int[] arr, int start, int end, int mid) {

        int s1 = mid - start + 1;
        int s2 = end - mid;

        int[] a1 = new int[s1];
        int[] a2 = new int[s2];

        for (int i = 0; i < s1; i++)
            a1[i] = arr[start + i];

        for (int i = 0; i < s2; i++)
            a2[i] = arr[mid + i + 1];

        int it1 = 0, it2 = 0, it3 = start;

        while (it1 < s1 && it2 < s2) {
            if (a1[it1] < a2[it2]) {
                arr[it3] = a1[it1];
                it1++;
            } else {
                arr[it3] = a2[it2];
                it2++;
            }
            it3++;
        }

        while (it1 < s1) {
            arr[it3] = a1[it1];
            it1++;
            it3++;
        }

        while (it2 < s2) {
            arr[it3] = a2[it2];
            it2++;
            it3++;
        }
    }

    static void mergeSort(int[] arr, int start, int end) {

        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            sort(arr, start, end, mid);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 22, 5, 23, 12, 56, 100};

        System.out.println("Before Sorting :: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting :: " + Arrays.toString(arr));
    }
}
