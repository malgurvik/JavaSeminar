package org.example.homework5.task03;

import java.util.Arrays;

public class task03 {
    public static void main(String[] args) {
        int[] initArray = {17, 32, 1, 4, 25, 17, 0, 3, -3, 10, 7, 64, 1, -2};
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));

    }
}
