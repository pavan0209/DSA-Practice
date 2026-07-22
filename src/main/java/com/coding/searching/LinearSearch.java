package com.coding.searching;

public class LinearSearch {

    static int index;

    static boolean searchElement(int[] array, int key) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                index = i;
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] array = {10, 20, 22, 5, 23, 12, 56};
        int key = 50;

        if (searchElement(array, key))
            System.out.println("KEY FOUND AT INDEX :: " + index);
        else
            System.out.println("KEY NOT FOUND");
    }
}
