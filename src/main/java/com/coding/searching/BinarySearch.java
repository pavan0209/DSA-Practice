package com.coding.searching;

public class BinarySearch {
    static int index;

    static boolean searchElement(int[] array, int key) {

        int start = 0, end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == key) {
                index = mid;
                return true;
            }
            if (array[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return false;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 5, 89, 90, 95, 100};
        int key = 10;

        if (searchElement(array, key))
            System.out.println("KEY FOUND AT INDEX :: " + index);
        else
            System.out.println("KEY NOT FOUND");
    }
}
